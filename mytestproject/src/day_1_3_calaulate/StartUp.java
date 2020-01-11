package day_1_3_calaulate;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

import day_1_3_calaulate.bean.Calculate;
import day_1_3_calaulate.factory.Factory;

public class StartUp {
	
	public static void main(String[] args) throws IOException {
		Factory	factroy=new Factory();
		Calculate cal=null;
				BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("输入第一个数字:");
				Double A =  Double.parseDouble(reader.readLine());
				System.out.println("输入第二个数字:");
				Double B = Double.parseDouble(reader.readLine());
				System.out.println("输入操作字符:");
				String str = reader.readLine();
				cal=factroy.newCal(str);
				cal.setA(A);
				cal.setB(B);
				System.out.println("结果为"+cal.result(A, B));
				//System.out.println("计算结果"+factroy.newCal(str).result(A, B));
		
	}

}
