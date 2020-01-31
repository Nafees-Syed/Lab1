/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeter;
import java.util.Scanner;
/**
 *
 * @author cstuser
 */
public class Perimeter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the height of the rectangle: ");
        double height = kb.nextDouble();
        
        System.out.print("Enter the length of the rectangle: ");
        double length = kb.nextDouble();
        
        double area = height * length;
        double perimeter = (height * 2)+(length *2);
        
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        
    }
    
}
