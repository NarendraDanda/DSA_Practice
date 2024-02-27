package LinkedList;

public class linkedList {
     Node head;
    public void insert(int data){
        Node node = new Node();
        node.data = data;
        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next !=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void display(){
        Node n = head;
        while(n.next != null){

            System.out.println(n.data);
            n = n.next;

        }
        System.out.println(n.data);

    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data =data;

        node.next = head;
        head = node;
    }

    public void insertAtPosition(int data, int index){
        Node node = new Node();
        node.data = data;
        Node n = head;

        if(index == 0){
            insertAtStart(data);
        }
        else{
            int position=0;
            while(position< index-1){
                n = n.next;
                position++;
            }
            node.next = n.next;
            n.next = node;
        }

    }

    public void deleteAt(int index){
        Node n =head;
        Node n1=null;
        if(index==0){
            head = head.next;
        }
        else{
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
            System.out.println("deleted number " + n.next.data);
            n.next = n.next.next;

        }
    }

    public class Node{
        int data;
        Node next;

        public Node() {
        }
        public Node(int data) {
            this.data = data;
        }


    }

}

