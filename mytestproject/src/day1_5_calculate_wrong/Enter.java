package day1_5_calculate_wrong;

import java.util.Scanner;

public class Enter {
	public static void main(String[] args) throws ExcepZeroDiv {
		Calculator  cal=new Calculator();
		Scanner sca=new Scanner(System.in);
		System.out.println("请输入第一个数字");
		Double param1=sca.nextDouble();
		System.out.println("请输入操作符");
		String operator =sca.next();
		System.out.println("请输入第二个数字");
		Double param2=sca.nextDouble();
		cal.setParam(operator, param1, param2);
		cal.calc();
	}
}
