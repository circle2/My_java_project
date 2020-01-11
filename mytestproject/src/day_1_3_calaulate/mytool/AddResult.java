package day_1_3_calaulate.mytool;

import day_1_3_calaulate.bean.Calculate;

public class AddResult extends Calculate{

	@Override
	public Double result(double A, double B) {
		// TODO Auto-generated method stub
		return A+B;
	}

	public class Div extends Calculate{
		@Override
		public Double result(double A, double B) {
			if(A==0) {
				return A/B;
			}else if(B==0) {
				System.out.println("除数不能为0");
			}
			return null;
		}
	}
	public class Mul extends Calculate{
		@Override
		public Double result(double A, double B) {
			// TODO Auto-generated method stub
			return A*B;
		}
	}
	public class SubResult extends Calculate {
		@Override
		public Double result(double A, double B) {
			// TODO Auto-generated method stub
			return A-B;
		}
	}
}
