package pizza;
/*
 * 主函数里new工厂，new订单
 */
public class EnterPizza {
	public static void main(String[] args) {
		SimpleFactory factory=new SimpleFactory();
		OrderPizza ord=new OrderPizza(factory);
		ord.orderPizza();
		
	}
}
