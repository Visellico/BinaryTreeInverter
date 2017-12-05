package data;

/**
 * Simple node data structure for a tree.
 * The data in the left child is less than this data, vice versa for the right child
 * Created by Henry on 12/4/2017.
 */
public class Node<E extends Comparable> {

    public E data;
    public Node<E> left;
    public Node<E> right;

    /**
     * data.Node builder for if you have an idea of what the final tree might look like,
     * and for hierarchical instantiation
     * @param data data of this node
     * @param left Left child
     * @param right Right child
     */
    public Node(E data, Node<E> left, Node<E> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * Create a leaf node (no children)
     * @param data data of this node
     */
    public Node(E data) {
        this.data = data;
    }

    /**
     * Create a new right or left child to hold the data,
     * or try attaching the data to a child if it already exists
     * @param data data to attach
     */
    public void attach(E data) {
        int result = data.compareTo(this.data);
        if (result > 0) {
            right = attach(right, data);
        } else if (result < 0) {
            left = attach(left, data);
        }
    }

    /**
     * Send the data down the tree until an appropriate leaf node can assign the data to
     * a new child.
     * @param child Child to recieve the input. If null, a new child is created.
     * @param data data to be consumed by the child.
     * @return
     */
    public Node<E> attach(Node<E> child, E data) {
        if (child == null)
            child = new Node<> (data);
        else
            child.attach(data);
        return child;
    }

    /**
     * Build a pre order traversal representation of this data.Node in the format
     * (data, leftChild, rightChild)
     * @return a string representation of this data.Node
     */
    public String toString() {
        return "(" + data + ", " + left + ", " + right + ")";
    }

}
