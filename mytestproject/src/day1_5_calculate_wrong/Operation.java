package day1_5_calculate_wrong;

public interface Operation {
	void setParam(double num1, double num2);

	double getResult() throws ExcepZeroDiv;

}
