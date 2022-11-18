package list.stack;
import list.HTLStack;

public class Main {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(20);
        s.push(21);
        s.push(22);
        s.pop();
        System.out.println(s.peek());
    }
}
