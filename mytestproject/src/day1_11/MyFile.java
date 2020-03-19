package day1_11;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class MyFile {
	public void doThis(File myFile) {
		//HashMap<String, String> map = new HashMap<>();
		// File[] listFiles1 = myFile.listFiles();
		// 列出该目录下的文件
		/*
		 * for (File file : listFiles1) { System.out.println(file.getName()); }
		 */
		// 判断文件是否为文件夹
		File[] File = myFile.listFiles();
		
		if (File == null) {
			
				
				// 转换时间
				// Calendar cal=Calendar.getInstance();
				// String localeString = cal.getTime().toLocaleString();
			// System.out.println(localeString);
				//System.out.println("文件名" + File.getName() + "   位置" + file);
			
			
		} else if (File != null) {
			for (File file : File) {
				long lastTime = file.lastModified();
				Date date = new Date(lastTime);
				String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
				
					System.out.println(file.getName()+"文件日期"+format);
					doThis(file);
				
			}
		}
	}

	public static void main(String[] args) {
		MyFile my = new MyFile();
		String str = "D:\\";
		File myFile1 = new File(str);
		if(myFile1.exists()) {
			my.doThis(myFile1);
		}
		
	}

}
