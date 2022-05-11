package sessionFour;

public class ZombieAttack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "Anil", "Zombie", "neel", "Chinmay" };
		System.out.println(alert(arr));
	}

	public static String alert(String[] array) {
		String alert = "";
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals("Zombie")) {
				alert = "Run away " + array[i + 1] + "!";
			}
		}
		return alert;
	}
}
