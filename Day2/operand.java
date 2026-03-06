import java.util.*;
public class operand {
    static Scanner sc = new Scanner(System.in);
    public static int[] accpetOperand(){
        System.out.println("Enter Num 1");
        int operand1 = sc.nextInt();
        System.out.println("Enter Num2");
        int operand2 = sc.nextInt();
        return new int[]{operand1,operand2};
    }
    
}
