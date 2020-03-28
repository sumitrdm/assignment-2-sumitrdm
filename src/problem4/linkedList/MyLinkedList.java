package problem4.linkedList;

public class MyLinkedList {
    private Node first;
    private Node last;

    public void addLast(int data) {
        Node node = new Node(data);
        if (first == last) {
            first = last = node;
            return;
        }
        last.setNext(node);
        last = node;


    }


}
