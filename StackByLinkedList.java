public class StackByLinkedList{
    static class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        public Node head;

        public Boolean isEmpty(){
            return head ==null;
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    public static void main(String[] args){
        Stack myStack = new Stack();
        myStack.push(1);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        while(!myStack.isEmpty()){
            System.out.println(myStack.peek()); //output: 6 5 4 1
            myStack.pop();
        }

    }
}