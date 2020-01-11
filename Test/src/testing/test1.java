package testing;

public class test1 {

	static public void main(String... args) {
		// System.out.println("Gaurav Ho gya 1st program at the end of the day ");

//		System.out.print(a + " " + b);
//		fab(count - 2);

		String str = "kuijj";
		System.out.println(str);
		System.out.println(palindrom(str));
	}

	private static String palindrom(String str) {
		// TODO Auto-generated method stub

		int i = 0, j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) != str.charAt(j)) {
				return "False";
			}
			i++;
			j--;
		}

		return "True";
	}

}
