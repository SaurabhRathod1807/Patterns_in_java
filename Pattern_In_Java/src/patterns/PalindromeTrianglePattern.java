//print following pattern.
//        1 
//      2 1 2 
//    3 2 1 2 3 
//  4 3 2 1 2 3 4 
//5 4 3 2 1 2 3 4 5
package patterns;
import java.util.*;
public class PalindromeTrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }

            for(int j=2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
