/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab11;

/**
 *
 * @author User
 */
public class ExceptionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if(args.length != 3){
            System.out.println("Please enter exactly 3 numbers as a, b, and c.");
        }
        try {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
        
            double x1 = (-b + Math.sqrt((b*b) - (4*a*c)) / (2*a));
            double x2 = (-b - Math.sqrt((b*b) - (4*a*c)) / (2*a));
        
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        catch (NumberFormatException e){
            System.out.println("Please input data in number format only.");
        }
    }
}
