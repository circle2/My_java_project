package pizza;
/*
 * 工厂在new对象，设置名字
 */
public class SimpleFactory {
	public Pizza createPizza(String type) {
		Pizza pizza=null;
		if("greek".equals(type)) {
			pizza=new GreekPizza();
			pizza.setName("希腊披萨");
		}
		else if("cheese".equals(type)) {
			pizza=new CheesePizza();
			pizza.setName("奶酪披萨");
		}
		else if("china".equals(type)) {
			pizza=new ChinaPizza();
			pizza.setName("中国披萨");
		}
		return pizza;
	}
}
