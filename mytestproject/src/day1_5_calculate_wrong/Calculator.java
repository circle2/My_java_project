package day1_5_calculate_wrong;

public class Calculator {
	private String operator;
	private double param1,  param2;
	
	public void setParam(String operator, double param1, double param2){//赋值初始化
		this.operator = operator;
		this.param1 = param1;
		this.param2 = param2;
	}
	
	public double calc() throws ExcepZeroDiv{
		Factory fac = new Factory(operator);
		Operation oper = fac.creatOper();
		oper.setParam(param1, param2);
		return oper.getResult();
	}
	class Factory {
		
		private String operator;
		
		public Factory(String operator){      //看不懂这一
			this.operator = operator;
		}
		
		public Operation creatOper(){
			Operation oper = null;
			try {
				oper = (Operation) Class.forName(operator).newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("此操作不存在"+operator);
				e.printStackTrace();
			}
			return oper;
		}
	}
}
