package day1_11;
import java.io.File;
import java.util.Scanner;

public class ListRoots
{
    public static File choose(File[] roots)
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("请输入你需要遍历的盘符(格式为: D:\\):");
        //用户输入要遍历的盘符
        String clientRoot=sc.next();
        
        //判断用户要遍历的盘符
        for(int i=0;i<roots.length;i++)
        {
            if(roots[i].toString().equals(clientRoot))
                return roots[i];
        }
        //查找无结果,退出
        return roots[0];
    }
    public static void main(String[] args)
    {
        
        //获取系统根
        File[] roots = File.listRoots();
        
        System.out.println("您系统的的盘有:");
        for(int i=0;i<roots.length;i++)
        {
            System.out.println(roots[i]);
        }
        
        //列出用户所选择的盘的内容
        File[] file=choose(roots).listFiles();
        for(int j=0;j<file.length;j++)
        {
            find(file[j]);
        }
        
    }
    //利用递归遍历所有文件夹
    public static void find(File file)
    {
        if (file.isDirectory())
        {
            System.out.println(file+"文件夹下有:");
            File[] files=file.listFiles();
            
            for(int i=0;i<files.length;i++)
            {
                find(files[i]);
                System.out.println("\t"+files[i].getName());
            }
        }
        else System.out.println("\t"+file.getName());
    }
};