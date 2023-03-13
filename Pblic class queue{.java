Pblic class queue{
    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node front, back;
    public queue(){
        this.front=null;
        this.back=null;
    }
    public void nqueue(int data){
        Node newNode=newNode(data);
        if(empty()){
            front=back=newNode;
        }
        else{
            back.next=newNode;
            back=newNode;
        }
    }
    public int dqueue(){
        if(empty()){
            System.out.print("queue is empty");
        }
        int data=front.data;
        front=front.next;
        if(front==null){
            back=null;
        }
        return data;
    }
    public boolean empty(){
        return front==null;
    }
}