package day12_29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyParse {
	public static void main(String[] args) throws ParseException {
		//parse 字符串转成日期对象
		String date="11-11-05";
		Date str_date=new SimpleDateFormat("hh-mm-ss").parse(date);
		System.out.println(str_date.getSeconds());
		
		
	}
}
