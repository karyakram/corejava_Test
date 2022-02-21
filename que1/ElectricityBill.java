package corejava.assessment_2.que1;
import java.util.*;

class UserMainCode{
	public static int calculateElectricityBill(String s1, String s2, int n){
		int n1 = Integer.parseInt(s1.substring(5, s1.length()));
		int n2 = Integer.parseInt(s2.substring(5, s2.length()));
		int res = Math.abs((n2 - n1) * n);
		return res;
	}
}

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int n = sc.nextInt();
		int n1 = UserMainCode.calculateElectricityBill(s1, s2, n);
		System.out.println(n1);
		sc.close();

	}

}
