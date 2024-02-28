import java.util.ArrayList;

public class StackByArrayList {
        static class  Stack{
            static ArrayList<Integer> list = new ArrayList<>();
            public  boolean isEmpty(){
                return list.size() == 0;
            }
            public void push(int data){
                list.add(data);
            }

            public int pop(){
                if(isEmpty()){
                    return -1;
                }
                int top = list.get(list.size()-1);
                list.remove(list.size()-1);
                return top;
            }
            public int peek(){
                if(isEmpty()){
                    return-1;
                }
               return list.get(list.size()-1);
            }
        }
        public static void main(String[] args){
            Stack myStack = new Stack();
            myStack.push(0);
            myStack.push(14);
            myStack.push(23);
            myStack.push(34);
            while(!myStack.isEmpty()){
                System.out.println(myStack.peek());
                myStack.pop();

            }
        }
}
