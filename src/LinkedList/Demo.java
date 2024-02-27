package LinkedList;

public class Demo {
    public static void main(String[] args){
        linkedList list = new linkedList();
        list.insert(12);
        list.insert(15);
        list.insert(34);
        list.insertAtStart(45);
        list.insertAtPosition(1,2);
        list.deleteAt(3);
        list.display();
    }
}
