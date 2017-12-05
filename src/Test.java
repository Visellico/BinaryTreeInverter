import data.Tree;

import java.util.Arrays;
import java.util.List;

/**
 * Test the tree inversion
 * Created by Henry on 12/4/2017.
 */
public class Test {

    public static void main(String[] args) {

        List<Integer> ints = Arrays.asList(4, 2, 7, 1, 3, 6, 9);
        Tree balancedTree = new Tree(ints);

        System.out.println(balancedTree);
        balancedTree.reverse();
        System.out.println(balancedTree);

    }

}
