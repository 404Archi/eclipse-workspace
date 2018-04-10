import java.util.Scanner;

public class zad3 
{
	static int b=0;
	static int c=0;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) 
	{


		int[] a = new int[10];
		podaj(a);
		wekszymniejszy(a);
		najwiekszy(a);
		double srednia=srednia(a);


		System.out.println("Liczb wiêkszych od 0 jest:	"+c);
		System.out.println("Liczb mniejszych od 0 jest:	"+b);
		System.out.println("suma liczb wynosi	"+sumuj(a));
		System.out.println("Œrednia liczb wynosi	"+srednia);
		System.out.println("Najwiêksza liczba to	"+najwiekszy(a));
		System.out.println("Najmniejsza liczba to	"+najmniejszy(a));
	}

	private static int najmniejszy(int[] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0 ;i<10;i++)
		{
			if(a[i]<min)min=a[i];
		}
		return min;

	}

	private static int najwiekszy(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0 ;i<10;i++)
		{
			if(a[i]>max)max=a[i];
		}
		return max;

	}

	private static double srednia(int[] a) {
		int suma=0;
		double srednia=0;
		for( int i = 0;i<10;i++)
		{
			suma=suma+a[i]; 
		}
		srednia=(double)suma/10;

		return srednia;

	}

	private static int sumuj(int[] a) {
		int suma = 0;
		for( int i = 0;i<10;i++)
		{
			suma=suma+a[i]; 
		}
		return suma;

	}

	private static int[] podaj(int[] a) {

		for( int i = 0;i<10;i++)
		{
			a[i] = s.nextInt();
		}
		return a;

	}

	private static void wekszymniejszy(int[] a) {
		for( int i = 0;i<10;i++)
		{
			if(a[i]<0)
				b++; 
			if(a[i]>0)
				c++;
		}

	}

}
