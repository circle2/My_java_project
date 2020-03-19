package day1_11;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
 
//使用递归遍历出磁盘某一分区（如D盘）所有文件的文件名
public class Recursive {
 
	public static void showDirectory(File file) {
		/**
		 * 用File[]数组得到E:\qwerty目录下的--所有子文件夹-路径
		 * 用List<File>列表得到E:\qwerty目录下的--所有文件-路径
		 */
		// 创建一个空的ArrayList对象fileList
		List<File> fileList = new ArrayList<File>();
		
		// file.listFiles()返回抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件和目录。
		// 返回值是一个 File[]数组
		File[] files = file.listFiles();
 
		// 如果目录为空，直接退出
		if (files == null) {
			return;
		}
 
		// foreach遍历files数组
		for (File a : files) {
			if (a.isFile()) {
				// boolean isFile()判断是否为文件，是文件返回true，否则返回false
				fileList.add(a);// 是文件，则添加到List<File>中
			} else if (a.isDirectory()) {
				// boolean isDirectory()判断是否为目录，是目录返回true，否则返回false
				// String getAbsolutePath()获得文件与子文件夹的绝对路径
				System.out.println(a.getAbsolutePath());
				// 递归调用showDirectory(File file)方法
				showDirectory(a);
			}
		}
		// foreach遍历fileList列表
		for (File f2 : fileList) {
			System.out.println(f2.getName());
		}
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("F:");
		// 显示与文件有关的属性信息
		System.out.println("文件或目录是否存在：" + file.exists());
		System.out.println("是文件吗：" + file.isFile());
		System.out.println("是目录吗：" + file.isDirectory());
		System.out.println("名称：" + file.getName());
		System.out.println("文件大小：" + file.length());
		System.out.println("===================");
		showDirectory(file);
	}
 
}