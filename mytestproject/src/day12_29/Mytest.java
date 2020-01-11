package day12_29;
import java.text.ParseException;
import java.util.Scanner;
  	 /*输入两行，第一行是当前时间，第二行是经过的时间，输出时钟现在的时间
			例子：输入         10：00：00
					   00：11：12
				  输出        10：11：12*/

	//将String数组转化为int数组(为后面进行运算)
public class Mytest {
	public static int [] changToarray(String[]a) {
		int b[] =new int [a.length];  //新键 int数组b
		for(int i=0;i<a.length;i++) {
			 b[i]=(int) Integer.parseInt(a[i]);  //转化
		}
		return b;
	}
	public static void main(String[] args) throws ParseException {
		Scanner sca=new Scanner(System.in);
		System.out.println("请输入当前时间");
		  String start=sca.next();     //输入1时间
		 System.out.println("请输入经过时间");
		  String gotime=sca.next();    //输入2时间
		 
		  int[] result=new int [3];    //result 数组是最终的结果数组
		  int[] a=changToarray(start.split(":")); //调用先用split分割成String数组 然后用changToarray方法转成int数组
		  int[] b=changToarray(gotime.split(":"));
		  for(int i=0;i<3;i++) {
			 result[i] =a[i]+b[i];    //运算
		  }
		  if(result[0]>24) {
			  result[0]=result[0]%24;  //时不能大于24 范围0-24
			 }
		  if(result[1]>60) {
			  result[1]=result[1]%60;  //分钟不能大于60，范围0-60
		  }
		  if(result[2]>100) {
			  result[2]=result[2]%100;  //毫秒不能大于100   范围0-100
		  }
		System.out.println(result[0]+":"+result[1]+":"+result[2]);
		sca.close();//关闭sca
	}
}
