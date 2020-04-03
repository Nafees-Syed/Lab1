
package question.pkg46;
import java.util.*;
/**Write a program that uses a for loop to outputs the sum of all integers between
 * 10 and 20, inclusivly, that is, 10+11+12.....+20.
 */
public class Question46 {

   
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);
        
        int number = 20;
        int loop;
        int add;
        
        for(loop = 10; loop <= number; loop++){
            
            add = (loop+1) + loop;
            System.out.println("loop value: " + add);
        }
        
    }
    
}
