
public class SwappingTwoNumbers {

	public static void main(String[] args) {
		
		
		int a =10, b=20;
		
		System.out.println("Before swaping values are.."+a+"  "+b);
		
	/*	// 1) Using third variable
		
			int t=a;
			a=b;
			b=t;
			System.out.println("After Swaping values are.."+a+"  "+b);
	*/
		
	/*   // 2) Using + and - operator
			
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swaping values are.."+a+"  "+b);
			
	*/
		
	/*	// 3) Using * and / operator (here a and b value should not be zero)
		
			a=a*b;
			b=a/b;
			a=a/b;
			
			System.out.println("After Swaping values are.."+a+"  "+b);
			
	*/
		
		
	/*	// 4) using bitwise operator
		
			a=a^b;
			b=a^b;
			a=a^b;
		
			System.out.println("After Swaping values are.."+a+"  "+b);
			
	*/
		
		// 5) Using single statement
		
			b=a+b-(a=b);
			
			System.out.println("After Swaping values are.."+a+"  "+b);
	}

}
