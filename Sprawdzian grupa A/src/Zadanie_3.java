import java.util.Scanner;

public class Zadanie_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		s.close();
		if(a%400 ==0)System.out.print("ROK JEST PRZESTÊPNY");
		else {
			if(a%4==0 && a%400==0 && a%100!=0)System.out.print("ROK JEST PRZESTÊPNY");
			else System.out.print("ROK NIE JEST PRZESTÊPNY");
		}
	}
}
