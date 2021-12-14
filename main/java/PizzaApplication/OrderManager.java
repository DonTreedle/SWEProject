package main.java.PizzaApplication;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 *
 * Format for:
 * Adding an Order :: EXEC AddOrder @customerid = *id*, @orderDate = 'YYYY-MM-DD'
 * Adding a PizzaOrder :: EXEC AddPizzaOrder @orderid = *id*, @pizzaid = *id*, @quantity = int
 * Adding an Other Item :: EXEC AddOtherOrder @orderid = *id*, @otherid = *id*, @quantity = int
 * 
 */

public class OrderManager {
    static final String DB_URL = "jdbc:sqlserver://localhost:1433";
    static final String USER = "SA";
    static final String PASS = "Pass123!";
    Connection conn;
    int OrderID;
    int CustomerID;

    
    OrderManager(int OrderID, int CustomerID) {
        this.OrderID = OrderID;
        this.CustomerID = CustomerID;
        String QUERY;
        try {
            QUERY = "SELECT * FROM Orders WHERE orderid = " + OrderID;
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);

            if (!rs.next()) {
                QUERY = "INSERT INTO Orders (customerid, orderDate) VALUES (" + CustomerID + ", '2021-12-06')"; //TODO format getDate
                stmt.execute(QUERY);
                rs = stmt.executeQuery("SELECT TOP 1 orderid FROM Orders ORDER BY orderid DESC");
                if (rs.next()) {
                    OrderID = rs.getInt("orderid");
                    System.out.println("Order now exists with orderid = " + OrderID);
                }
            } else {
                System.out.println("Order already exists");
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    OrderManager(int CustomerID) {
        this.CustomerID = CustomerID;
        String QUERY;
        try {
            QUERY = "INSERT INTO Orders (customerid, orderDate) VALUES (" + CustomerID + ", '2021-12-06')"; //TODO format getDate
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute(QUERY);
            ResultSet rs = stmt.executeQuery("SELECT TOP 1 orderid FROM Orders ORDER BY orderid DESC");
            if (rs.next()) {
                OrderID = rs.getInt("orderid");
                System.out.println("Order now exists with orderid = " + OrderID);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPizzaToOrder(int PizzaID, int quantity) {
        String QUERY = "SELECT * FROM Pizzas WHERE pizzaid = " + PizzaID;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            if (rs.next()) {
                if (rs.getInt("quantity") == 0) {
                    System.out.println("We dont have anymore of this :(");
                    return;
                }
                System.out.println(rs.getString("pizzaName") + " has been placed in the order");
                QUERY = "EXEC AddPizzaOrder @orderid = " + OrderID + ", @pizzaid = " + PizzaID + ", @quantity = " + quantity;
                stmt.execute(QUERY);
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addPizzaToOrder(int[] selections, int[] toppings) {
        String QUERY = "INSERT INTO pizzaParams (OrderID, Size, Crust, Sauce, PizzaType) VALUES (" + OrderID + ", " + selections[0] + ", " + selections[1] + ", " + selections[2] + ", " + selections[3] + ")";
        try {
            int PizzaID;
            Statement stmt = conn.createStatement();
            stmt.execute(QUERY);
            ResultSet rs = stmt.executeQuery("SELECT TOP 1 PizzaID FROM pizzaParams ORDER BY PizzaID DESC");
            rs.next();
            PizzaID = rs.getInt("PizzaID");
            for (int i = 0; i < toppings.length; i++) {
                if (toppings[i] == 1) {
                    stmt.execute("INSERT INTO pizzaIng VALUES (" + PizzaID + ", " + OrderID + ", " + (i + 1) + ")");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addMiscToOrder(int MiscID, int quantity) {
        String QUERY = "SELECT * FROM Other_Items WHERE otherid = " + MiscID;
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            if (rs.next()) {
                if (rs.getInt("quantity") == 0) {
                    System.out.println("We dont have anymore of this :(");
                    return;
                }
                System.out.println(rs.getString("otherName") + " has been placed in the order");
                QUERY = "EXEC AddOtherOrder @orderid = " + OrderID + ", @otherid = " + MiscID + ", @quantity = " + quantity;
                stmt.execute(QUERY);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addMiscToOrder(List<Integer> L) {
        try { 
            Statement stmt = conn.createStatement();
            for (int i = 0; i < L.size(); i++) {
                stmt.execute("INSERT INTO drinkOrders VALUES (" + OrderID + ", " + L.get(i) + ")");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> getOrder() {
        List<String> order = new ArrayList<String>();
        try {
            String QUERY = "SELECT P.quantity, Pizzas.pizzaName FROM PizzaOrders AS P INNER JOIN Pizzas ON P.pizzaid = Pizzas.pizzaid WHERE orderid = " + OrderID;
            String temp = "";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            ResultSetMetaData rsmd = rs.getMetaData();
            while (rs.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    temp += rs.getObject(i) + " ";
                }
                order.add(temp);
                temp = "";
            }

            QUERY = "SELECT O.quantity, Other_Items.otherName FROM OtherOrders AS O INNER JOIN Other_Items ON O.otherid = Other_Items.otherid WHERE orderid = " + OrderID;
            ResultSet rs2 = stmt.executeQuery(QUERY);
            ResultSetMetaData rsmd2 = rs2.getMetaData();
            while (rs2.next()) {
                for (int i = 1; i <= rsmd2.getColumnCount(); i++) {
                    temp += rs2.getObject(i) + " ";
                }
                order.add(temp);
                temp = "";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return order;
    }
}