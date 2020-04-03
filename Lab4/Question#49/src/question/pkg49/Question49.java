
package question.pkg49;
import java.util.*;
/**Write a program that reads the value (say n) from the user and outputs Hello world
 * (n) times.Verify that the user has entered an integer.if the input is 3, the 
 * output will be Hello World printed 3 times.
 */

public class Question49 {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String garbage;
        
        System.out.print("Enter the amount of time you want to repeat the sentence: ");
        
        while(! kb.hasNextInt()){
            garbage = kb.nextLine();
            System.out.print("Not a number, please enter a valide integer!: ");
        }
        int n = kb.nextInt();
        int i;
        
        for(i = 0 ; i < n ; i++){
            
            System.out.println("Hello, world!");
        }
        
    }
    
}
