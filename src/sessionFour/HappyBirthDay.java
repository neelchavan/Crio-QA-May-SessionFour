package sessionFour;

public class HappyBirthDay {

	static String happyBirthday(int gifts) {
		String[] gifts_response = { "Hardly any", "We need some more gifts", "Woah that's a lot of gifts!",
				"Happy Birthday Jhandu!!!" };

		String respond = gifts <= 5 ? gifts_response[0]
				: gifts > 5 && gifts < 23 ? gifts_response[1] : gifts == 23 ? gifts_response[3] : gifts_response[2];

		return respond;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(happyBirthday(4));
	}
}
