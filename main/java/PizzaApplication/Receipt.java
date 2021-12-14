/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.PizzaApplication;

/**
 *
 * @author jesse
 */
public class Receipt {
    public static void receipt(String customerName, String customerLName, String customerAddress, String customerNumber, int quantity, boolean isDelivery, boolean isCredit){//receipt start

    //creating pizza object start

    //order[] orderInfo = new order[quantity];

   for(int i = 0;i < quantity;i++){//for start
       // orderInfo[i] = new order();  
    }//for end

        //creating pizza object end

  
      //printing receipt resturant name start

  System.out.println("          Pizza Resturant");

  System.out.println("-------------------------------------");

  System.out.println("             Receipt");

   System.out.println("-------------------------------------");

     //printing receipt resturant name end


      //printing customer info start

   System.out.println(customerName+ " " + customerLName+ "\n" + "address: " + customerAddress + "\n" + "Number: " + customerNumber + "\n");

   System.out.println("-------------------------------------");
  System.out.println("-------------------------------------");

         //printing customer info end


         //printing item objects and price start

  for(int i = 0;i < quantity;i++){//for start

  //System.out.print(orderInfo[i].item() +"                          $"+orderInfo[i].getitemP() +"\n");  

  }//for end

    System.out.println("-------------------------------------");

         //printing item objects and price end


           //finding total start

    double sum = 0;

    for(int i = 0; i< quantity;i++){//for start

      //sum = sum + orderInfo[i].getitemP();

    }//for end

              //finding total end


                //printing total start

   System.out.println("Amount Due: " + "                 $" + sum);

  System.out.println("\n");
  System.out.println("-------------------------------------");
  System.out.println("-------------------------------------");

              //printing total end
   

           //is the order delivery start

  if(isDelivery == true){//if start

  System.out.println("Delivery order \n");

  }//if end

  else{//else start

    System.out.println("Pick-up order \n");

  }//else end

                //is the order delivery end



             //if payment by credit, sign start

   if(isCredit == false){//if start

  System.out.println("\n");

  }//if end

  else{

    System.out.println("            Signiture \n \n ____________________________________\n");

  }


            //if payment by credit, sign end


  System.out.println("            Thank You");

  

  }//receipt end
}
