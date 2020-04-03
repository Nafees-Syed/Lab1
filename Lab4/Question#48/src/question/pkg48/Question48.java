
package question.pkg48;
import java.util.*;
/**Write a program that uses a for loop to count how many multiples of 7 are 
 * between 33 and 97, inclusive.
 */
public class Question48 {

    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int mult = 7;
        int i;
        int result;
        
        for(i = 1; i <= 100; ++i){
            result = 7 * i;
            if(result >=33 && result <=97){
                System.out.println(result);
            }
            
        }
    }
    
}
