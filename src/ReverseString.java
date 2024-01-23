
public class ReverseString {

	public static void main(String[] args) {
		
		//comment added
		
		String str = "anna";
		String reverse = "";
		
		
		/* 
		
			// 1) Using String Concatenation(+) operator
			 
			int length = str.length();//4
			
			for(int i=length-1;i>=0;i--) {  //3 2 1 0 -1
				
				reverse = reverse+str.charAt(i);  //DCBA
			}
			
			System.out.println("Reversed string is :" + reverse);
		
		
		*/

		/* 
		 
			//2) Using character array
			
			char a[]= str.toCharArray();
			int length = a.length();//4
			
			for(int i=length-1;i>=0;i--) { //3 2 1 0 
				reverse = reverse+a[i];   //DCBA
			}
			
			System.out.println("Reversed String is:"+ reverse);
	    
	    */
		
			//3) Using String Buffer Class
		
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb.reverse());
			
			
	}

}
