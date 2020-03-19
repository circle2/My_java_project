package day1_11;

import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/*
 * 可行方案
 */
public class Main {
	public static void main(String args[]) {
		String filePath = "D:\\";
		Main m1 = new Main();
		File file = new File(filePath);
		m1.test(file);
	}
	private void test(File file) {
		Map<String, String> fileList = new HashMap<String, String>();
		// 判断是否为文件夹 if(file.isDirectory()){
		File[] files = file.listFiles();
		if (files != null) {
			for (int i = 0; i < files.length; i++) {
				test(files[i]);
			}
		}
		else if (file != null) {
			String key = file.getAbsolutePath();
			Long lastTime = file.lastModified();
			Calendar cal = Calendar.getInstance();
			cal.setTimeInMillis(lastTime);
			@SuppressWarnings("deprecation")
			String value = cal.getTime().toLocaleString();
			fileList.put(key, value);
		}
		for (Entry<String, String> entry : fileList.entrySet()) {
			System.out.println(entry.getKey() + "    最后修改时间：  " + entry.getValue());
		}
	}
}
