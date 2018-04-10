import java.util.Scanner;

public class Zadanie_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Ile chcemy liczb?	");
		int a = s.nextInt();
		int suma = 0;
		for(int i = 1; i < a+1;i++) {
			int b = s.nextInt();
			suma = suma+(b*i);
		}
		double srednia = suma / a;
		System.out.print("Srednia wynosi "+srednia);
		s.close();
	}

}
