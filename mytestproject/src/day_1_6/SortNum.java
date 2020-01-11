package day_1_6;

import java.util.ArrayList;

public class SortNum {
	 /*
	 * 有一组数据“1 2 3 4 5 6”，让他么按照不同的顺序输出，要求4不能是第三位，而且35不能相连？
	 */
	 static int count=0;
	public static void f(String in, ArrayList al) {
		if (al.size() == 1) {
			String tmp = in;
			if (!(tmp.contains("35") || tmp.contains("53") || tmp.indexOf('4') == 2)) {  //indexof("")返回的是下标
				count++;
				System.out.println(tmp +" ="+count);       //输出符合条件的结果
			}
		} else {
			ArrayList hsc = (ArrayList) al.clone();
			if (in.length() != 0) {
				hsc.remove(in.substring(in.length() - 1));   //SubString截取字符串;remove移除下标元素;
			}
			for (Object i : hsc) {
				f(in + i, hsc);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		f("", al);
	}
}
