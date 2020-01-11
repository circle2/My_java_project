package day_1_6;

public class SortNum2 {
	public static void main(String[] args) {
		int  count =0;
		for (int i = 123456; i <= 654321; i++) {
			String tmp = "" + i;
			//左边不能是4 ，右边35不能在一块
			if (tmp.matches("[1-6]{2}[12356][1-6]{3}") && tmp.replaceAll("(\\d)(?=\\d*\\1)|35|53", "").length() == 6 ) {
			count ++;
			System.out.println(i);
			}
			}
		System.out.println(count);
	}
}
