package sessionFour;

public class NonDecreasingArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nonDecreasingArray(new int[] { 1 }));
	}

	static Boolean nonDecreasingArray(int[] arr) {
		boolean isDecreasing = false;
		if (arr.length == 1) {
			isDecreasing = true;
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				isDecreasing = false;
				break;
			}
			isDecreasing = true;
		}
		return isDecreasing;
	}
}
