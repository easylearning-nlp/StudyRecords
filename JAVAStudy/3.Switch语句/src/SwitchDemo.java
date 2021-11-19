/**
 * switch语句格式：
 *switch(表达式){
 *     case值1：
 *            语句体1；
 *            break；
 *     case值2：
 *            语句体2；
 *            break；
 *     ...
 *     default：
 *            语句体n+1;
 *            [break;]
 *     格式说明：
 *     1、case后面跟的是要和表达式进行比较的值；
 *     2、break表示中断结束的意思，用来结束switch语句
 *     3、default表示所有情况都不匹配时，就执行该处语句，和if-else语句中的else蛮像的
 *}
 */
import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args){
        System.out.println("请输入星期数(1-7):");
        Scanner sc = new Scanner(System.in);
        int weekday = sc.nextInt();
        switch (weekday){
            case 1:
                System.out.println("今天星期1");
                break;
            case 2:
                System.out.println("今天星期2");
                break;
            case 3:
                System.out.println("今天星期3");
                break;
            case 4:
                System.out.println("今天星期4");
                break;
            case 5:
                System.out.println("今天星期5");
                break;
            case 6:
                System.out.println("今天星期6");
                break;
            case 7:
                System.out.println("今天星期7");
                break;
            default:
                System.out.println("退出，输入有误");
        }
    }

}
