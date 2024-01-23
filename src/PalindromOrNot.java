import java.util.Scanner;

public class PalindromOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter The String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reverse="";
		int length = str.length();//4
		
		for(int i=length-1;i>=0;i--) {  //3 2 1 0 
			
			reverse = reverse+str.charAt(i);  //DCBA
		}
		
		System.out.println("Reversed string is :" + reverse);
		if(str.equalsIgnoreCase(reverse)) {
			System.out.println("Given String is Palindrome");
		}else {
			System.out.println("not palindrome");
		}

	}

}
