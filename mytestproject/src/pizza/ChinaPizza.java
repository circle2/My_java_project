package pizza;

public class ChinaPizza extends Pizza {

	@Override
	public void prepare() {
		System.out.println("给中国披萨准备原材料");
	}

}
