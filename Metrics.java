/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;
import java.util.Scanner;
/**
 *
 * @author cstuser
 */
public class Metrics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter a distance in meter: ");
        double meter = kb.nextDouble();
        
        double feet = meter * 3.28;
        
        System.out.println("the distance in feets is: " + feet);
    }
    
}
