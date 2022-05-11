package sessionFour;

public class CubeSumOfEvenNum {

	public static int cubeSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum = sum + (arr[i] * arr[i] * arr[i]);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cubeSum(new int[] { 1, 2, 3, 4 }));
	}

}
