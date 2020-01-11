package day1_5_calculate_wrong;

public abstract class AbstractOper implements Operation {

	protected double param_num1, param_num2;

	public void setParam(double num1, double num2) {
		param_num1 = num1;
		param_num2 = num2;
	}

}
