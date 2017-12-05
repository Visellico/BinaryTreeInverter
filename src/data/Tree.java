package data;

import java.util.List;

/**
 * An integer binary tree where elements greater than any given node are placed in its right branch, and
 * elements less than a given node in its left branch. No autobalancing.
 * Created by Henry on 12/4/2017.
 */
public class Tree {

    public Node<Integer> root;

    /**
     * Create a new integer binary tree
     * @param ints data to be stored in the tree
     */
    public Tree(List<Integer> ints) {
        assert(ints.size() > 0);
        root = new Node<>(ints.get(0));

        for (int i = 1; i < ints.size(); i++) {
            root.attach(ints.get(i));
        }
    }

    /**
     * Invert the children of a node
     * @param flip data.Node who's children are to be inverted
     */
    public void invert(Node<Integer> flip) {
        if (flip != null) {
            Node<Integer> swapTemp = flip.left;
            invert(flip.left);
            invert(flip.right);

            flip.left = flip.right;
            flip.right = swapTemp;
        }
    }

    /**
     * Invert the entire tree
     */
    public void invert() {
        invert(root);
    }

    /**
     * Construct a string representation of the entire tree, starting with root, in the format
     * (node data, leftChild, rightChild)
     * @return String representation of the tree
     */
    public String toString() {
        return root.toString();
    }

}
