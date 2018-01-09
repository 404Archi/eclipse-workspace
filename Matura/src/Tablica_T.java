import java.util.Scanner;

public class Tablica_T 
{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.print("Ile chcesz liczb\n");
		int k = s.nextInt();
		int tab[]=new int[k];
		for (int i = 0; i < k;i++)
		{
			System.out.print("podaj liczbe \n");
			tab[i]=s.nextInt();
		}
		int zlicz[]=new int[tab.length];
		for (int i = 0; i < tab.length-1;i++)
		{
			
			zlicz[tab[i]]=zlicz[tab[i]]+1;
		}
		for(int i=0;i<tab.length;i++)
		{
			System.out.print(zlicz[i]+", ");
		}

	}

}
