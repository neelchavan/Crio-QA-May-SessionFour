package sessionFour;

public class SmallestValueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(smallestValue(new int[] { 4, 2, 3, 1, 5 }, "index"));
	}

	public static int smallestValue(int[] arr, String toReturn) {
		int smallest = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
				index = i;
			}
		}
		if (toReturn.equals("index")) {
			return index;
		}
		return smallest;
	}

}
