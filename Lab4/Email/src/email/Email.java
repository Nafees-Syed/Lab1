/*
Write a program to validate email address. Use a loop to go over each character,
and find an @ sign followed by 2 or more words seperated by dots. Example of a 
valid emails are araujot@vanier.college and araujot@vaniercollege.qc.ca, and 
invalid ones would be araujot&vanier.college or araujot@vanier.
 */
package email;
import java.util.*;

public class Email {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Enter a valid email address: ");
        String mail = kb.nextLine();
        
        int length = mail.length();
        int a = '@';
        
        for(int i = 0; i <= length; ++i){
            
            if(i == a){
            
        }
        
        }
            
    }
    
}
