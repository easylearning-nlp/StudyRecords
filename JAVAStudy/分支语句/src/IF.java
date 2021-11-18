/**
 * if 语句格式
 * 格式：
 * if (关系表达式){
 *     语句体；
 * }
 */
import java.util.Scanner;
public class IF {
    public static void main(String[] agrs){
        System.out.println("开始输入两个数a和b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a == b){
            System.out.println("a和b相等");
        }else {
            System.out.println("a和b不相等");
        }
    }
}
