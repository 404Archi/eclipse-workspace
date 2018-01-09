import java.util.Scanner;

public class Silnia_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sc = s.nextInt();
		int f1=1;
		int f2=1;
		System.out.print(f1+" "+f2+" ");
		for(int i=0;i<sc;i++)
		{
			int f3=f1*f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
		}

	}

}
