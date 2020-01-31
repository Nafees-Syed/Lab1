/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currency;
import java.util.Scanner;
/**
 *
 * @author cstuser
 */
public class Currency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter an amount of money in CAD: ");
        double cad = kb.nextDouble();
        
        double us = cad * 0.76;
        double eur = cad * 0.69;
        
        System.out.println("CAD: " + cad);
        System.out.println("US: " + us);
        System.out.println("EUR: " + eur);
                
    }
    
}
