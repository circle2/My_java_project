package pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {
	private SimpleFactory factory;
	private Pizza pizza;
	public OrderPizza(SimpleFactory factory) {
		this.factory=factory;
	}
	public void orderPizza() {
		String type="";
		do {
			type=getType();	 
			pizza=this.factory.createPizza(type);  //订单调用工厂
			if(pizza!=null) {						//订单使用pizza的方法				
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}
			else {
				System.out.println("订购失败");
				break;
			}
		}
		while(true);
	}
	public String getType() {
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza type");
			String type=reader.readLine();
			return type;
		} catch (Exception e) {
			return null;
		}
	}
}
