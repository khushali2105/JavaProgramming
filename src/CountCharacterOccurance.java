
public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		String str = "BANANA";
		
		int totalcount = str.length();
		
		int toatalcountafterremovingA = str.replace("A", "").length();
		
		int count = totalcount-toatalcountafterremovingA;
		
		System.out.println("Number of occurance of A is:"+count);
		

	}

}
