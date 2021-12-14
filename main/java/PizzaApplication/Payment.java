package main.java.PizzaApplication;

import java.util.*;

//Program to process payments
//Sprint 2 Miguel Sanchez

public class Payment {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        //Asks the user for total number of items ordered.
        //This portion can be changed to take input from another section of GUI instead of from the user.
        System.out.print("Enter total number of items ordered: ");
        int totalItems = scan.nextInt();
        System.out.println();

        //Initialize new double array to hold prices
        //Initialize new String array to hold menu items
        double[] priceArray = new double[totalItems];
        String[] itemArray = new String[totalItems];

        //Initialize sum variable
        double sum = 0;

        //Add each menu item to the item array
        for(int i = 0; i < itemArray.length; i++){
            System.out.print("Enter item " + (i+1) + " name: ");
            itemArray[i] = scan.next();
        }

        //Add each price to the price array. Add each array cell to the sum variable
        for(int i = 0; i < priceArray.length; i++){
            System.out.print("Enter item " + (i+1) + " price: ");
            priceArray[i] = scan.nextDouble();
            sum+=priceArray[i];
        }

        //print out both arrays to display in receipt format
        //This portion of the code may not be necessary but wanted to include it
        System.out.println();
        for(int i = 0; i < priceArray.length; i++){
            System.out.print(itemArray[i] + "\t");
            System.out.print("$"+priceArray[i] + "\n");
        }

        System.out.println("_____________");
        System.out.println("Total:\t" + "$" + sum);
        System.out.println();

        //Asks the user for the form of payment. Cash, Check, Card.
        //This portion can be changed to take input from another section of GUI instead of from the user.
        System.out.print("Enter form of payment (cash/check/card): ");
        String formOfPayment = scan.next();

        //Displays the form of payment chosen, approves transaction, displays new total which should be $0.00
        System.out.println("Form of Payment: " + formOfPayment);
        System.out.println("Transaction Approved!");
        double newSum = sum - sum;
        System.out.println("Total Amount Due: $" + newSum);
    }
}
