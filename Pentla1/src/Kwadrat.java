import java.util.Scanner;
public class Kwadrat {
	static Scanner s 	= new Scanner(System.in);
	static int a		= 0;
	static int b		= s.nextInt();
	static int c		= b-2;
	static int d 		= c-2;
	static int e 		= 0;
	static int x 		= c-1;
	static int y 		= c-1/2;
	static int count	= 1;
	public	static void main(String[] args) {
		calywersz();
		przebieg();
		calywersz();


	}
	private static void przebieg() 			{
		for(int i=0;i<c;i++) {
			brzeg();
//			przekatna();
//			przekatna2();
			przekatna3();
			brzeg();
			System.out.print("\n");
		}	
	}
	private static void przekatna3() 		{
		for(int j = 0;j<e;j++) {
			System.out.print(" ");
		}
		for(int j = 0;j<1; j++) {		
			System.out.print("#");
		}
		for(int j = 0;j<d;j++) {
			System.out.print(" ");
		}
		for(int j = 0;j<1; j++) {		
			System.out.print("#");
		}
		for(int j = 0;j<e;j++) {
			System.out.print(" ");
		}
		count++;
		dzialanie();

	}
	private static void przekatna2() 		{
		int d=c-a-1;

		for(int j = 0;j<d; j++) {
			System.out.print(" ");
		}

		for(int j = 0;j<1; j++) {		
			System.out.print("#");
		}
		for(int j = 0;j<a;j++) {
			System.out.print(" ");
		}
		a++;

	}
	private static void przekatna() 		{

		int d=c-a-1;
		for(int j = 0;j<a;j++) {
			System.out.print(" ");
		}
		for(int j = 0;j<1; j++) {		
			System.out.print("#");
		}
		for(int j = 0;j<d; j++) {
			System.out.print(" ");
		}
		a++;
	}
	private static void dzialanie() 		{
		if(count<(b/2)) {
			d-=2;
			e++;
		}
		if(count==(b/2)) {
			d=0;
		}
		if(count>(b/2))	{
			e--;
			d+=2;
		}	

	}
	private static void brzeg() 			{
		for(int i = 0;i<1; i++) {		
			System.out.print("#");
		}


	}
	private static void calywersz() 		{
		for(int i=0;i<1;i++) {

			for(int j = 0;j<b; j++) {		
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}
