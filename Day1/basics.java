public class basics {
    static int a = 6;
    static int b = 5;

    public void table(int num) {
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " * " + (i+1) + " = " + (num * (i+1)));
        }
    }

    public static void main(String[] args) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        if(a > b) {
            System.out.println(a + " is greater than b");
        } else if(a < b) {
            System.out.println(b + " is greater than a");
        } else {
            System.out.println("Both are equal");
        }
        if(a > b && a > 5) {
            System.out.println("a is greater than b and 5");
        } 
        if( 1 == 1 || 3 == 2) {
            System.out.println("True");
        }

        for(int i =0;i < 5;i++) { // 0 - 4 = 5 times
            System.out.println(i);
        }
        int j =0;
        while (j < 5) {
            System.out.println("Äaryan");
            j++;
        }

        basics b = new basics();
        b.table(5);
    }
}
