package day12_29;

/*
	 * 实现一个非常简易版本的HTML浏览器，
	 * 能处理文本和两种HTML的tag, 规则为处理2种标签，
	 * 将连续的tab ，空格，换行符号转化为一个空格，每一行不超过80个字符，单词不能被截断
	 */
public class EasyEdge {
	public static void main(String[] args) {
		String str="Thank you  for taking		you  HTML  time	 is  realy time  to have this oppernation "
				+ " \r to take part<br>	 in this   interview <hr>"
				+ "-----   --- --<hr>---- ---<br>-- ---- <hr>----<br>--- <hr>--------------"
				+ "---  --- -- - -- ---- -<br>-	- - -- -";
		//String s1=str.replace("<br>|<hr>", " ");
		//String s2=s1.replace("<hr>", " ");
		//String s4=s2.replaceAll("\\s{2,}|\t", " "); //连续多个空格，转化为一个空格
		//String ss[]=s4.split(" ");                  //转化得到数组
		String smax=str.replaceAll("<br>|<hr>|\\s{2,}|\t", " ");
		String ss[]=smax.split(" "); 
		for(int i=0;i<ss.length;i++) {
			if(i>0&&i%10==0) {
				ss[i]+="\n";
			}
			System.out.print(ss[i]);     //每10个单词换行
		}
		System.out.print(smax);
	}
}
