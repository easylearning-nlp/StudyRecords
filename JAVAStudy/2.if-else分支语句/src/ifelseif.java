/***
 * if语句格式3
 * if(关系表达式){
 *     语句1;
 * }else if{
 *     语句2;
 * }
 * ...
 * else{
 *     语句n+1;
 * }
 */
import java.util.Scanner;
public class ifelseif {
    public static void main(String[] agrs){
        System.out.println("请输入对应的星期数（1-7）：");
        Scanner sc = new Scanner(System.in);
        int weekday = sc.nextInt();
        if (weekday == 1){
            System.out.println("今天是星期一");
        }else if (weekday == 2){
            System.out.println("今天是星期二");
        }else if (weekday == 3){
            System.out.println("今天是星期三");
        }else if (weekday == 4){
            System.out.println("今天是星期四");
        }else if (weekday == 5){
            System.out.println("今天是星期五");
        }else if (weekday == 6){
            System.out.println("今天是星期六");
        }else if (weekday == 7){
            System.out.println("今天是星期天");
        }else {
            System.out.println("结束");
        }
    }
}
