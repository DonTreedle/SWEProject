package main.java.PizzaApplication;

import java.sql.*;

public class CustomerDB {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433";
    private static final String USER = "SA";
    private static final String PASS = "Pass123!";
    Connection conn;
    int id;
    String email;
    String password;

    public CustomerDB(String email, String password) {
        this.email = email;
        this.password = password;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    } // end constructor

    public boolean login() {
        try (CallableStatement cstmt = conn.prepareCall("{call Login(?, ?, ?, ?)}");) {
            //Statement stmt = conn.createStatement();
            cstmt.setString("email", email);
            cstmt.setString("password", password);
            cstmt.registerOutParameter(3, java.sql.Types.NVARCHAR);
            cstmt.registerOutParameter(4, java.sql.Types.INTEGER);
            cstmt.execute();
            String response = cstmt.getString(3);
            id = cstmt.getInt(4);

            switch(response) {
                case ("invalid login"):
                    System.out.println(response);
                    return false;
                case("incorrect password"):
                    System.out.println(response);
                    return false;
                case("user successfully logged in"):
                    System.out.println(response + ", id: " + id);
                    return true;
                default:
                    System.out.println("unknown error");
                    return false;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
    public void createAccount(String name, String address, String phoneNumber) {
        try {
            String QUERY = "EXEC AddCustomer @name = \'" + name + "\', @email = \'" + email + "\', @password = \'" + password + "\', @address = \'" + address + "\', @phone = \'" + phoneNumber + "\'";
            Statement stmt = conn.createStatement();
            stmt.execute(QUERY);
            login();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
