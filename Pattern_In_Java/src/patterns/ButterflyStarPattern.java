//Print following pattern.
//*           *
//**         **
//***       ***
//****     ****
//*****   *****
//****** ******
//****** ******
//*****   *****
//****     ****
//***       ***
//**         **
//*           *



package patterns;
import java.util.*;
public class ButterflyStarPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = sc.nextInt();
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			int space = 2*(n-i);
			for(int j=0; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int j=0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			int space = 2*(n-i);
			for(int j=0; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int j=0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
