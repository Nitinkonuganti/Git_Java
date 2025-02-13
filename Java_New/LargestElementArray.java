package Loops;

public class LargestElementArray {
	public static void main(String[] args) {
		int [] arr = {58,52,85,789,6};
		int largest = arr[0];
		for(int i =1;i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("The largest element is" + largest);
	}

}
