package System.out;

import java.util.Scanner;

public class Eratostenes_3 {

	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n =s.nextInt();
			boolean[] sito= new boolean[10001];
		
			erasito(sito);
		
		
			for(int i=0;i<n;i++)
			{
				int liczba=s.nextInt();
				if(sito[liczba]==true)
					System.out.println("TAK");
				else
					System.out.println("NIE");
			}


		}//koniec main
		
		
	public static void erasito (boolean[] sito)
	{
		for(int i=0; i < sito.length;i++)
		{
			sito[i]=true;
		}
		sito[0]=false;
		sito[1]=false;


		int koniec=sito.length/2;
		for(int i=2;i<koniec;i++)
		{
			for(int j=i+i ; j<sito.length ; j=j+i)
			{
				sito[j]=false;
			}
		}

	}
}

