/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;
import problem1.node.TreeNode;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(85);
        bst.insert(25);
        bst.insert(45);
        bst.insert(15);
        bst.insert(17);
        bst.insert(15);
        bst.insert(10);
        System.out.println("root of the tree" + bst.getRoot().getData());
        System.out.println("preorder traversal");
        MyMain m = new MyMain();
        m.pre(bst.getRoot());
        System.out.println();
        System.out.println("postorder traveral");
        System.out.println();
        System.out.println("\n\nANSWER A is YES");
        System.out.println("ANSWER FOR THE B IS NO");
    }

    public void pre(TreeNode node) {


        if (node != null) {
            System.out.println(node.getData() + "");
            pre(node.getLeft());
            pre(node.getRight());
        }
    }

    public void post(TreeNode node) {
        if (node != null) {
            post(node.getLeft());
            post(node.getRight());
            System.out.println(node.getData() + "");
        }
    }
}

