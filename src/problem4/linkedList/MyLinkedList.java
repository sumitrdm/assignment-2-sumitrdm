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

    public void deleteFirst() {
        if (first == null) {
            first = last = null;
            return;
        }
        var second = first.getNext();
        first.setNext(null);
        first = second;
    }

    public void display() {
        var current = first;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();

        }
    }


}





