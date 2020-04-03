/*
Write a program that receives a word as an input from the user and checks if it is 
a palindrome: if it reads the same backwards as forward. A few examples are "civic", 
"radar" and "level". To make your program more advanced, ignore punctuation, 
capitalization, and spaces, and recognize sentences as "A man, a plan, a canal - Panama",
"Murder for a jar pf red rum" and "Madam, I'm Adam".
 */
package palindrome;
import java.util.*;


public class Palindrome {

    
    public static void main(String[] args) {
       
        Scanner kb = new Scanner(System.in);
        String original, reverse = "";   
        
        System.out.println("Enter a word here" );
        original = kb.nextLine();
        
        int length = original.length();
        
        for(int i = length -1; i>=0; i--)
            reverse = reverse + original.charAt(i);
        if(original.equals(reverse))
            System.out.println("The word is a palindrome!");
        else
            System.out.println("the word is not a palindrome...");
    }
    
}
