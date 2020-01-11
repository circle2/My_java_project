package day1_8;

public class Array {
	 int  mai;
	public static void main(String[] args) {
		try {
			mb_operate();
		} catch (Exception e) {
			System.out.println(2);
		}
		System.out.println(3);
	}
	public static void mb_operate() throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println(1);
		}
	}
}
