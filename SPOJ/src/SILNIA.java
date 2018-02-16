import java.util.Scanner;

public class SILNIA 
{
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		int i=0;
		do {
		int a=s.nextInt();
		if(a==0)System.out.println	(0+" "+1);
		if(a==1)System.out.println	(0+" "+1);
		if(a==2)System.out.println	(0+" "+2);
		if(a==3)System.out.println	(0+" "+6);
		if(a==4)System.out.println	(2+" "+4);
		if(a==5)System.out.println	(2+" "+0);
		if(a==6)System.out.println	(2+" "+0);
		if(a==7)System.out.println	(4+" "+0);
		if(a==8)System.out.println	(2+" "+0);
		if(a==9)System.out.println	(8+" "+0);
		if(a>=10)System.out.println	(0+" "+0);
		i++;
		}while(i<b);
		s.close();
	}

}
