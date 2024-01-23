import java.util.Arrays;

public class SecondndHighestNumberInArray {

	public static void main(String[] args) {
		int largest = 0;
		int secondLargest = 0;
		
		int arr[] = {9,3,4,-2,34,56,78,100};
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>largest) {
				secondLargest = largest;//0,9,34,56,78
				largest = arr[i];//9,34,56,78,100
			}else if(arr[i]>secondLargest) {
				secondLargest=arr[i];//3,4
			}
		}	
			System.out.println("Given array is:"+Arrays.toString(arr));
			System.out.println("The Second Largest number is:"+ secondLargest);
		}
		
		
	}


