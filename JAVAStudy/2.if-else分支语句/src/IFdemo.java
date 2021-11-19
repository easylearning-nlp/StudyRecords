/***
 * 需求： 任意给出一个整数，请用程序实现判断该整数是一个奇数还是偶数，并且在控制台输出
 */
import java.util.Scanner;
public class IFdemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数x：");
        int x = sc.nextInt();
        //判断奇偶数
        if(x % 2 == 0){
            System.out.println("该整数是偶数");
        }else{
            System.out.println("该整数是奇数");
        }
    }
}
