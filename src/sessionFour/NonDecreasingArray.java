package sessionFour;

public class NonDecreasingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isDecreasingArray());
	}

	public static boolean isDecreasingArray() {
		int[] arr = { -1, 2, 2 };
		int a = arr[0];
		int b = arr[1];
		int c = arr[2];
		System.out.println();
		if ((a > b && b > c) || (a == b && b == c) || ((a > b && a > c) && (b == c))) {
			return false;
		}
		return true;
	}
}
