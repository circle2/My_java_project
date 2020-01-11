package day_1_3_calaulate.bean;

public abstract class Calculate {
	public  double A;
	public	double B;
	public abstract Double result(double A,double B);
	public void setA(double a) {
		A = a;
	}
	public void setB(double b) {
		B = b;
	}
}
