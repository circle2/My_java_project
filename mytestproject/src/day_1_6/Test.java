package day_1_6;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		String in="1234";
		//System.out.println(in.indexOf('2'));
		//System.out.println(in.substring(4));
		//al.remove(1);
		//System.out.println(al);
		for (Object o : al) {
			System.out.println(o);
		}
	}
}
