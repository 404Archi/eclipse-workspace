import java.util.Scanner;

public class DoWhile 
{


	public static void main(String[] args) 
	{
		Scanner scanner =new Scanner(System.in);
		int number;
		int sum=0;
		double sr=0;
		int i=0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		do
		{
			System.out.println("Podaj liczb�:");
			number = scanner.nextInt();
			sum=sum+number;
//			System.out.println("suma to:"+ sum);
			i++;
			if((number > max)&&(number!=0))
			{
				max = number;

			}
			if((number < min)&&(number!=0))
			{
				min = number;

			}
		}while(number!=0);
		scanner.close();
		sr=sum/(i-1);
		System.out.println("suma wynosi: " + sum);
		System.out.println("Srednia wynosi: " + sr);
		System.out.println("maksymalna warto�� wynosi: " + max);
		System.out.println("minmalna warto�� wynosi: " + min);
	}
}
