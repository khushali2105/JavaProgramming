
public class SwappingTwoString {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Sapna";
		
		String str = str1+str2;//HelloSapna
		
		str2 = str.substring(0, str.length()-str2.length());
		str1 = str.substring(str2.length());
		
		System.out.println("After Swapping :"+str1 +" "+str2);

	}

}
