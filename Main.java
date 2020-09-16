import java.util.Scanner;
/**
 * This program will show you the subtotal,taxes and total of the cost depending on what size pizza you got
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner (System.in);
    System.out.println ("What is the size of the pizza (in cm):");
    // prompt the user for the size of the pizza
    double size = input.nextDouble();
    //declare a variable to store Labourmoney
    final double Labourmoney = 0.75;
    //declare a variable to store Powermoney
    final double Powermoney = 0.99;
    //declare a variable to store inredients
    double ingredients = 0.50 * size ;

    //declare a variable to store subtotal
    double subtotal = Labourmoney + Powermoney + size * 0.50;
    //tell the user the total 
    System.out.println("Subtotal:" + "$" + subtotal);
    //declare a variable to store taxes
    double taxes = subtotal * 0.13;
    // tell the user the taxes
    System.out.println ("Taxes:"+ "$" + taxes);
    //declare a variable to store total
    double total = subtotal + taxes ;
    //tell the user the total
    System.out.println("Total:" + "$" + total);
    
    //find which category the pizza size is in
    if( size >= 1 && size <= 20){
      System.out.println("We are going to make you a cute little pizza!");


    }else if ( size > 20 && size < 40){
      System.out.println("This will be delicious!");

    } if ( size > 40){
      System.out.println ("Whoa,big pizza! You might need a truck to get this home!");

    }
    


  }
}
