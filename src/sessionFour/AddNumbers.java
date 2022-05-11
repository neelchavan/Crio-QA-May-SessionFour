package sessionFour;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addNums(3));
	}

	public static int addNums(int n) {
		int num = 0;
		for (int i = 1; i <= n; i++) {
			num += i;
		}
		return num;
	}
}
