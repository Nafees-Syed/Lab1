/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myageis;

import java.util.Scanner;
/**
 *
 * @author cstuser
 */
public class MyAgeIs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner(System.in);
        
        System.out.print("the current year is: ");
        
        int Cyear = kb.nextInt();
        
        System.out.print("My year of birth is: ");
        
        int Byear = kb.nextInt();
        
        int Age = Cyear - Byear;
        
        System.out.println("My age is: " + Age);
    }
    
}
