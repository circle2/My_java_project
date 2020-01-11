package day1_5_calculate_wrong;

public class ExcepZeroDiv extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double val;
	public ExcepZeroDiv(Double value) {
		this.val=value;
		System.out.println("除数不能为0");
	}
}
