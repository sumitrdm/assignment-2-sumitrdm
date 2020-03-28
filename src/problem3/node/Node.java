/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;

public class Node {
    String name;
    int roll_no;
    Node next;

    public Node(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
        this.next = null;
    }
}
