/*
* Student: Eduardo Aguirre
* Session 3
* Assignment 4
* Java program that creates an Array List and allows user to add more items and sort the Array List Values. 
*/

import java.util.ArrayList; //Imports Array List Class from java API Class Library to create the Array List
import java.util.Scanner;//Imports Scanner Class from java API Class Library to allow user input
import java.util.Collections; //Imports Collections Class from java API Class Library to add reverse the Array to a List

public class AddItemSort {
    
    public static void main(String[] args) { //Main Method to call to start the Program
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); //Creates an Instance of the Scanner
        ArrayList<String> groceries = new ArrayList<String>(); //Creates an empty Array List
        
        //Uses the add Method to add Items the to Array List 
        groceries.add("Bananas"); 
        groceries.add("Apples");
        groceries.add("Pears");
        groceries.add("Carrots");
        groceries.add ("Lettuces");
        groceries.add("Mangos");
        
        System.out.println ("Unsorted Product:   \n"
        + groceries.toString()); //Prints the list of unsorted Products in the ArrayList 
        
        Collections.sort(groceries); //Uses the Collections Class to sort the Array List
        
        System.out.println ("Sorted Product:   \n" //Prints the list of sorted Products in the ArrayList
                + groceries.toString());
        
        System.out.print ("Do you want to add Product ? "); //Prompts the  user to add more Products
        String choice = sc.nextLine(); //Stores the response from the User
        while (choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("Y") ) //If user selects Yes or Yes Executes code below
        {
            System.out.print ("Add the new Product :"); //Prompts user to add new Product
            String newProduct = sc.nextLine();
            boolean productFound = false;
            System.out.println ("You just added :" +newProduct);
            
            int i=0;
            while (i<groceries.size()) //Validates that the Product does not already exist
            {
                if (newProduct.equalsIgnoreCase(groceries.get(i))) //Compare added Product against Product in the ArrayList
                {
                    System.out.println("The Product already exists "); //Indicates duplicate Product when the Product already exists
                    productFound=true; 
                    System.out.print ("Do you want to add one more Product ? ");
                    String addMore = sc.nextLine();
                    choice=addMore;
                }
                i++;
            }     
                if (productFound==false) //If Product does not exist then add Product
                {
                groceries.add (newProduct);
                System.out.print ("Do you want to add one more Product ? ");
                String addMore = sc.nextLine();
                choice=addMore;
                } 
          }
                
        System.out.println ("Unsorted Products:   \n"
        + groceries.toString()); //Prints unsorted list of Product after the Product is added
        
        Collections.sort(groceries); //Sort the Array List after the Product is added
        
        System.out.println ("Sorted Product:   \n"
                + groceries.toString()); //Prints sorted list of Product after the Product is added
        
        
        System.out.println("Thanks for using the App");  //Good bye message
            
        }
        
    }