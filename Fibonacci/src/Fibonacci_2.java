import java.util.Scanner;


public class Fibonacci_2 {
	static Scanner s =new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Któr¹ chcesz liczbe");
		int a =s.nextInt();
		int f1=0;
		int f2=1;
		int f3 = 0;
		for(int i=0;i<a;i++)
		{
			f3=f1+f2;
			
			f1=f2;
			f2=f3;
		}
		System.out.print(f3+" ");
	}
}


