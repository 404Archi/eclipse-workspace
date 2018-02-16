import java.util.Scanner;

public class CALC {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		String str = s.nextLine();
		int wynik[]=new int[a];
		for(int i = 0;i<a;i++)
		{
			str = s.nextLine();
			int x=Character.getNumericValue(str.charAt(2));
			int y=Character.getNumericValue(str.charAt(4));
			

			if(str.charAt(0) == '+') wynik[i]=x+y;
			if(str.charAt(0) == '-') wynik[i]=x-y;
			if(str.charAt(0) == '*') wynik[i]=x*y;
			if(str.charAt(0) == '/') wynik[i]=x/y;
			if(str.charAt(0) == '%') wynik[i]=x%y;


		}
		for(int i = 0;i<a;i++)
		{
			System.out.println(wynik[i]);
		}
	}


}
