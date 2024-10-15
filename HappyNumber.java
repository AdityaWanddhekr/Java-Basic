public class HappyNumber {

	public static void main(String[] s) {
		int no = 23;

		while (no != 1 && no != 4) {
			int rem = 0, sum = 0;
			int temp = no;
			while (temp > 0) {
				rem = temp % 10;
				sum = sum + (rem * rem);
				temp = temp / 10;
			}
			no = sum;

		}

		if (no == 1) {
			System.out.println("Number is Happy");
		} else {
			System.out.println("Number not Happy");
		}

	}

}