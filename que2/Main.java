package corejava.assessment_2.que2;
import java.util.Scanner;
class UserMainCode{
	public static int validateColorCode(String s){
		boolean b = false, b1 = false;
        String s2 = s.substring(1, s.length());
        if (s.length() == 7)
            if (s.charAt(0) == '#')
            b1 = true;
        if (b1 == true)
            for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (c != '#') {
                if (s2.matches("[A-Fa-f0-9]{6}|[A-Fa-f0-9]{3}"))
                    b = true;
                else {
                    b = false;
                    break;
                }
            }
        }
        if(b) return 1;
        else
        return -1;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserMainCode u = new UserMainCode();
		Scanner s = new Scanner(System.in);
		System.out.println(" Enter color code ");
        String s1 = s.next();
        int  b = u.validateColorCode(s1);
        if (b == 1)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
		
		
	}

}
