//数据输入

/**
 * 1.2 Scaaner使用步骤
 * (1)导包 import java.util.Scanner;
 * (2) 创建对象
 * Scanner sc = new Scanner(System.in);
 * (3) 接受数据
 * int i = sc.nextInt()
 */
import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        //接受数据
        System.out.println("请输入你想要输入的数字：");
        int i = sc.nextInt();
        //输出数据
        System.out.println("i:"+i);
    }
}
