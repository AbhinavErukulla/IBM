import java.util.*;

public class Menu{
    Scanner sc = new Scanner(System.in);
    public int displayMenu(){
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiply");
        System.out.println("4. Module");
        System.out.println("5. Division");
        int choice = sc.nextInt();
        return choice;
    }

    public static void main(String args[]){
        Menu menu = new Menu();
        int choice = menu.displayMenu();
        int[] operands = operand.accpetOperand();
        switch (choice) {
            case 0:
                System.out.println("Ëxit system");
                System.exit(0);
                break;
            case 1:
                System.out.println("Addition");
                System.out.println(calculate.add(operands[0], operands[1]));
                break; 
            case 2:
                System.out.println("Substraction");
                System.out.println(calculate.sub(operands[0], operands[1]));
                break;
            case 3:
                System.out.println("Multiplication");
                System.out.println(calculate.mul(operands[0], operands[1]));
                break; 
            case 4:
                System.out.println("Modules");
                System.out.println(calculate.mod(operands[0], operands[1]));
                break;
            case 5:
                System.out.println("Division");
                System.out.println(calculate.div(operands[0], operands[1]));
                break;       
            default:
                break;
        }
    }
}