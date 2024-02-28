package Stack.Problems;

import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(12);
        myStack.push(13);
        myStack.push(14);
        myStack.push(15);
        pushAtBottom(10, myStack);
        while(!myStack.isEmpty()){
            System.out.println(myStack.peek());
            myStack.pop();
        }
    }
}
