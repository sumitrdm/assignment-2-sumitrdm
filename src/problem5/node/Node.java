/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {
    Student student;
    Node next;

    public Node(Student student) {
        this.student = student;
        this.next = null;
    }
}
