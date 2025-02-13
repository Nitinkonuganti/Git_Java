package Loops;

public class SmallestEleArray {
	public static void main(String[] args) {
		int [] arr = {58,52,85,789,6};
		int smallest = arr[0];
		for(int i =1;i<arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("The largest element is" + smallest);
	}

}



