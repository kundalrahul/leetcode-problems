package leetcode.problems;

//Question: - https://leetcode.com/problems/palindrome-number/

public class Palendrom {

	public static void main(String[] args) {
		int no = 122;
		boolean flag = findPalendorme(no);
		if (flag == true)
			System.out.println("no is palendrome");
		else
			System.out.println("no is not palendrome");
	}

	private static boolean findPalendorme(int no) {
		String s = String.valueOf(no);
		String rev = new StringBuilder(new String(s)).reverse().toString();

		return s.equals(rev);
	}

}
