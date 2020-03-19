package day1_11;

import java.io.File;
import java.util.Arrays;

public class IOTest {
	public static void main(String[] args) {
		// 查看是否有D盘
		String roots = Arrays.toString(File.listRoots());
		System.out.println(roots);
		if (roots.contains("G:\\")) {
			System.out.println("有G盘，正在执行遍历操作");
			// 遍历我们已经知道它的根目录为D盘了！！
			// 我们现在需要 ：如果D盘是目录文件的话，那么我们递归，如果它不是根目录的话，跳出递归
			File file = new File("G:\\");
			if (file.exists()) {
				System.out.print("文件夹：" + Arrays.toString(file.list()));
				System.out.println(" ");
			} else {
				System.out.println("该文件不存在" + file.getAbsolutePath());
			}
			recursion(file);
		} else {
			System.out.println("没有G盘！！！！");
		}
	}

	private static void recursion(File file) {
		if (file.isDirectory()) {
			System.out.println(file.getName());
			File[] files = file.listFiles();
			if (files != null) {
				for (File file1 : files) {
					recursion(file1);
				}
			}
		}
	}
}