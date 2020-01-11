package day1_5_calculate2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import day1_5_calculate2.factory.AddOperationFactory;
import day1_5_calculate2.factory.OperationFactory;
import day1_5_calculate2.operation.Operation;

public class FactoryMethod {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("1 2 +");


		System.out.println("输入第一个数字:");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("输入第二个数字:");
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("输入操作字符:");
		String string = br.readLine();


		/*System.out.println("num1= "+num1);
		System.out.println("num2= "+num2);
		System.out.println("string="+string);*/
		// 利用工厂方法设计模式设计计算器
		OperationFactory factory = null;
		Operation operation = null;
		if ("+".equals(string)) {
		factory = new AddOperationFactory(); // 创建加法工厂
		operation = factory.getIntance(); // 利用加法工厂产生具体的加法对象
		operation.setNum1(num1); // 为加法属性设置值
		operation.setNum2(num2);
		System.out.println("num1 + num2 = " + operation.getResult());
		}else{
		System.out.println("你输入的不是  + ");
		}
	}
		
}
