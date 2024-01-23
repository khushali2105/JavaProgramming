import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter The Number:");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt(); //4567
		
		
		// 1) Using Algoritham
		
		/*
		   int rev = 0;
		   while(num!=0)
		{
			rev = rev*10 + num%10;  //(0*10 + 4567%10 =(0+7) =7), (7*10 + 456%10 = (70+6) = 76),(76*10 +45%10 = (760+5)= 765),(765*10 + 4%10 = (7650+4) = 7654)
			num = num/10; //(4567/10 = 456),(456/10 = 45),(45/10 =4)
			
		}
		System.out.println("Reverse Number Is:"+ rev);
		
		*/
		
		// 2) using stringbuffer class
		
		/*
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev = sb.reverse();
		
		System.out.println("Reverse number is:"+ rev);
		
		*/
		
		// 3) Using StringBuilder class
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder rev = sbl.reverse();
		System.out.println("Reverse number is:"+ rev);
		
		
		
		
		
		
		
		
	}

}
