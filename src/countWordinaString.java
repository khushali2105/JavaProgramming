import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class countWordinaString {

	public static void main(String[] args) {
		
		// With HashMap
		
		// 1) Declare a HashMap in Java of <String, Integer>
		// 2) Split the given string and store the words into a String array.
		// 3) Traversing the array, check if the word is in the HashMap or not.
		// 4) If it is not in the HashMap, then store the word as key and 1 as the initial value; if the word is present in the HashMap then increase the value against the word.
		// 5) Once the traversal is complete, print the HashMap.
		
		
		System.out.println("Enter The String:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
	/*	Without using containsKey method
	 
		// 1)
		// Declaring a HashMap of <String, Integer>
		
		 Map<String, Integer> hashMap = new HashMap<>();
		 
		
		// 2),3),4)
		 
		 // Splitting the words of string
	     // and storing them in the array.
		 
		 String[] words = s.split(" ");
		 
		 for(String word : words) {
			 
			 // Asking whether the HashMap contains the
	         // key or not. Will return null if not.
			 
			 Integer integer = hashMap.get(word);
			 
			 if(integer == null)
				 
				// Storing the word as key and its
	            // occurrence as value in the HashMap.
				 
				 hashMap.put(word,1);
			 else {
				 
				// Incrementing the value if the word
	            // is already present in the HashMap.
				 
				 hashMap.put(word,integer+1);
			 }
		 }
		 
		 //5)
		 System.out.println(hashMap);
		
		
		*/
		
		// Using ContainsKey method
		
		// 1)
				// Declaring a HashMap of <Sthewjwrhuring, Integer>
				
				 Map<String, Integer> hashMap = new HashMap<>();
				 
				
		// 2),3),4)
				 
				 // Splitting the words of string
			     // and storing them in the array.
				 
				 String[] words = s.split(" ");
				 int count = 1;
				 for(String word : words) {
					 
					// containsKey(key) will return a boolean value
			            // i.e. true if it contains the key and false if
			            // it doesn't.
					 
					 if(hashMap.containsKey(word))

						 hashMap.put(word,hashMap.get(word)+1);
					     
						 
					 else {
						 
						 hashMap.put(word,1);
						 
					 }
				 }
				 
		//5)
				 System.out.println(hashMap);
				 for(int i=0;i<s.length()-1;i++) {
						if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) 
						{
							count++;
						}
					}
					
					System.out.println("Number of word in a string:"+" "+count);
		
		
		
		
		
		
		//without Hasmap
		
		/* 
		System.out.println("Enter the String:");
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();//String we enter(ex:welcome java)
		
		int count =1;
		
		for(int i=0;i<s.length()-1;i++) {
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) 
			{
				count++;
			}
		}
		
		System.out.println("Number of word in a string:"+" "+count);
		
		*/

	}
	
	

}
