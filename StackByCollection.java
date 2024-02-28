import java.util.*;
public class StackByCollection {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(20);
        myStack.push(24);
        myStack.push(45);
        myStack.push(56);
        while(!myStack.isEmpty()){
            System.out.println(myStack.peek());
            myStack.pop();
        }
    }    
}
