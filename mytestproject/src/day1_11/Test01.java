package day1_11;
import java.io.File;
public class Test01 {
	    public static void main(String[] args) {
	        File d = new File("D:\\三阶段");
	        Dir (d);
	    }
	    public static void Dir(File dir) {
	        if (dir.exists()) {
	            for (File f : dir.listFiles()) {
	                if (f.isDirectory()) {
	                    System.out.println("DIR: " + f.getName());
	                    System.out.println(f.getAbsolutePath());
	                    Dir(f);
	                } else {
	                    System.out.println(" File: " + f.getName());
	                }
	            }
	        }
	    }
}
