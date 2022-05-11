package sessionFour;

public class NthFabionacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fabioNum(3));
	}

	public static int fabioNum(int num) {
		int num1 = 0, num2 = 1, num3 = 0;

		int counter = 0;

		// Iterate till counter is N
		while (counter < num) {

			// Print the number
			// System.out.print(num1 + " ");

			// Swap
			num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
			counter = counter + 1;
		}
		return num1;
	}
}