package day1_5_calculate2.operation;

public class AddOperation extends Operation {

	@Override
	//子类实现父类的抽象方法。实现自己的特有功能。
	public int getResult() {
		return this.getNum1() + this.getNum2();
	}

}
