public class Stack{
    private Node top;
    public class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void push(int data){
        Node newNode=newNode(data);
        if(top==null){
            top=newNode;
        }
        else{newNode.next=top;
        top=newNode;
        }
    }
    public int pop(){
        if(top==null){
            System.out.print("Empty stack");
        }
        int data=top.data;
        top=top.next;
        return data;
    }
    public int pik(){
        if(top==null){
             System.out.print("Empty stack");
        }
        return top.data;
    }
    public boolean Empty(){
        return top==null;
    }
}