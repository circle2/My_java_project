public class Test1 {
	static int test;
	static boolean d(){
		test++;
		return true;
		}
	public static void main(String[] args){
			test=0;
			if ((d() | d()) || d()){
				test++;
				}
			System.out.println(test);;
		}
	
}
