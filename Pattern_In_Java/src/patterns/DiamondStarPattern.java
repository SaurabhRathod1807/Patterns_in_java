//Print Following pattern
//	  *
//     ***
//    *****
//   *******
//  *********
// ***********
// ***********
//  *********
//   *******
//    *****
//     ***
//      *
package patterns;
import java.util.*;
public class DiamondStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=i ; j>=0; j--) {
				System.out.print("*");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n ; i>=0; i--) {
			for(int j=0; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j>=0; j--) {
				System.out.print("*");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
