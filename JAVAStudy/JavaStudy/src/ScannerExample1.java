import java.util.Scanner;
public class ScannerExample1 {
    public static void main(String[] agrs){
        float heightmax;
        float heighttemp;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个和尚的身高：");
        float a  = sc.nextFloat();
        System.out.println("请输入第二个和尚的身高：");
        float b = sc.nextFloat();
        System.out.println("请输入第三个和尚的身高：");
        float c = sc.nextFloat();
        System.out.println("三个和尚的身高分别是："+"a:"+a+" b:"+b+" c:"+c);
        heighttemp = (a>b)?a:b;
        heightmax = (heighttemp>c)?heighttemp:c;
        System.out.println("最高和尚的身高是："+heightmax);
    }
}
