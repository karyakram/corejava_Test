package corejava.assessment_2.que4;
import java.util.Scanner;
class UserMainCode{
	public  static int validatePassword(String pass) {
		int d = 0;
		if (pass.length() >= 8) {
			if (pass.contains("#") || pass.contains("@") || pass.contains("_")) {
				char c = pass.charAt(0);
				// System.out.println(c);
				if (Character.isAlphabetic(c)) {
					char dd = pass.charAt(pass.length() - 1);

					if ((Character.isAlphabetic(dd)) || (Character.isDigit(dd)))

					{
						if (pass.matches(".[0-9]{1,}.") || pass.matches(".[a-zA-Z]{1,}.")) {

							return 1;

						} else {
							return -1;
						}
					} else {
						return -1;
					}
				} else {
					return -1;
				}
			} else {
				return -1;
			}

		} else {
			return -1;
		}
		
	}
}
public class Validation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int ans =UserMainCode.validatePassword(a);
		
		if(ans==1) {
			System.out.println("Valid");
		}
		else
			System.out.println("Not Valid");
		}
}