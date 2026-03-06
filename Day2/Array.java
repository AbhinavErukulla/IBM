import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Array{
    public static void main(String arg[]){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);

        System.out.println(num);

        for (int i=0;i<=num.size();i++){
            //System.out.println(num.get(i));
        }

        int i = 0;
        while(i < num.size()){
            System.out.println(num.get(i));
            
        }

        Stack<String> s= new Stack<>();
        s.push("First");
        s.push("Second");
        s.push("Third");

        Queue<String> q = new ArrayDeque();
        q.add("Fourth");
        q.add("Five");


    }
}