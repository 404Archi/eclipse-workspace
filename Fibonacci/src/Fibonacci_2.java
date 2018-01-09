import java.util.Scanner;

<<<<<<< HEAD

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
=======
public class Fibonacci_2 
{

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.print("Któr¹ czêœæ ci¹gu chcesz? ");
		int a= s.nextInt();
		s.close();
		int f1=1;
		int f2=1;
		int f3 = 0;
		for(int i = 0; i<a-2;i++)
			{
>>>>>>> 020c745aff30c381c35872b946fc50c93875adf4
			f3=f1+f2;
			
			f1=f2;
			f2=f3;
<<<<<<< HEAD
		}
		System.out.print(f3+" ");
	}
}


=======
			}
		System.out.print(f3);


	}

}
>>>>>>> 020c745aff30c381c35872b946fc50c93875adf4
