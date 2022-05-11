package sessionFour;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = sumOfArray(new int[] { 1, 2, 3 });
//		int b = sumOfArray(new int[] { 4, 5, 6 });
//		int sumOfTwoArray = a + b;
//		System.out.println(sumOfTwoArray);
		System.out.println(returnString());
	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	static String returnString() {
		return " I am a string";
	}
}
