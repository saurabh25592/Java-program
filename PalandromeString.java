
public class PalandromeString {

	public static void main(String[] args) {

		String name = "level";

		String d = name;
		int l = name.length();

		for (int i = l - 1; i > 0; i--) {
			name.charAt(i);

		}


		if (name != d) {
			System.out.println("not palandrome ");
		} else {
			System.out.println("palandrome ");
		}

	}

}
