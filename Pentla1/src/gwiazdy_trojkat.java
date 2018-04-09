import java.util.Scanner;

public class gwiazdy_trojkat {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt(); //a-wiersze
		int b=1;
		int c=a-1;
		for(int n = 1; n <= a; n++) 
		{
			for(int k = 0; k < c;k++){
				System.out.print(" ");
				
				
			}
			for(int k = 0; k < b;k++){
				System.out.print("*");
				
				
			}
			for(int k = 0; k < 1;k++){
				System.out.print("	");
				
				
			}
			for(int k = 0; k < b;k++){
				System.out.print("*");
				
				
			}
			System.out.print("\n" );
			b++;
			c--;
		}
		
		
	    
	}
}
	