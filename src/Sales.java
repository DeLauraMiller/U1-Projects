import javax.swing.*;

public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */

    public static void main(String[] args) {

        double price;
        int discount;
        int quantity;
        int tax;
        double subtotal;
        double dSubtotal;
        double taxTotal;
        double totalCost;

        price = Double.parseDouble(JOptionPane.showInputDialog("What is the item price?"));
        discount = Integer.parseInt(JOptionPane.showInputDialog("How much was the discount?"))/100;
        quantity = Integer.parseInt(JOptionPane.showInputDialog("How many are you buying?"));
        tax = Integer.parseInt(JOptionPane.showInputDialog("What is the sale tax?"));

        subtotal = price * quantity;
        dSubtotal = subtotal * (1 - discount);
        taxTotal = dSubtotal * (tax/100.0);
        totalCost = dSubtotal + taxTotal;

        JOptionPane.showMessageDialog("Subtotal: " + dSubtotal  +"\n Tax: " + tax + "%"  + "\nTotal Tax: " + taxTotal  + "\nTotal Cost:" + totalCost);

        System.out.println("Subtotal: " + dSubtotal);
        System.out.println("Tax: " + tax + "%");
        System.out.println("Total Tax: " + taxTotal);
        System.out.println("Total Cost:" + totalCost);
        System.exit(0);


    }
}
