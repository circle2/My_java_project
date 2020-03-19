package day1_11;

import java.io.File;
public class Filejpg {
    public static void main(String[] args) {
        File fl = new File("E:\\");
        System.out.println(fl.isDirectory());
        getNum(fl);
        System.out.println(count);
    }
    static int count = 0;
    private static void getNum(File fl) {
        File[] fls = fl.listFiles();
        if(fls!=null) {
        	for (File fi : fls) { 
            System.out.println(fi.getName());
            if(fi.isFile()&&fi.getName().endsWith(".jpg")){
                count++;
            }else if(fi.isDirectory()){
                getNum(fi);
            }
        }
        }
        
    }
}