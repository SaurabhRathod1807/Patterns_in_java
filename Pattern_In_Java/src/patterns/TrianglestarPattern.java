//print following pattern.
//    * 
//   * * 
//  * * * 
// * * * * 
//* * * * * 
package patterns;
import java.util.*;
public class TrianglestarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
//        int n = sc.nextInt();
//        
//        for(int i=1; i<=n; i++){
//           for(int j=1; j<=n-1; j++){
//              System.out.print(" ");
//           }
//           for(int j=1; j<=i; j++){
//              System.out.print("*" + " ");
//           }
//           System.out.println();
//        }
//        for(int i=n; i>=0; i--){
//           for(int j=1; j<=n-1; j++){
//              System.out.print(" ");
//           }
//           for(int j=1; j<=i; j++){
//              System.out.print("*" + " ");
//           }
//           System.out.println();
//        }

    }
}
