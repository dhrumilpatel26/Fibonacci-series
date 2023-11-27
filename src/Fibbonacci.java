import java.util.Scanner;

public class Fibbonacci {
	
	public static void main(String[] args)
	{
		int number,a=0,b=1,c;
		
		System.out.print("enter the number:");
		Scanner read=new Scanner(System.in);
		number=read.nextInt();
		for(int i=1;i<=number;i++)
		{
			System.out.print(a + " ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
