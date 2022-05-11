package sessionFour;

public class CreatePhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(phoneNumber(new int[] { 9, 2, 8, 4, 5, 9, 2, 2, 9, 7 }));
	}

	public static String phoneNumber(int[] a) {
		String phone = "";
		for (int i = 0; i < a.length; i++) {
			phone = phone + Integer.toString(a[i]);
		}
		return phone;
	}
}
