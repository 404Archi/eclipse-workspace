import java.util.Scanner;

public class Zadanie_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a+b==c)System.out.print("Brawo! W porz�dku! OK!");
		else System.out.print("Niestety �le!");
		s.close();
	}

}