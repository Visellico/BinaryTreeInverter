import data.Tree;

import java.util.Arrays;
import java.util.List;

/**
 * Test the tree inversion
 * Created by Henry on 12/4/2017.
 */
public class Test {

    public static void main(String[] args) {

        new Test().go();
    }

    public void go() {
        runTest(Arrays.asList(4,2,7,1,3,6,9));
        System.out.println();
        runTest(Arrays.asList(1,2,3,4,5,6));
        System.out.println();
        runTest(Arrays.asList(6,5,3,2,4,8));
    }

    //TODO compare reversed output of the tree to an expected reversed output
    public void runTest(List<Integer> list) {
        Tree tree;

        tree = new Tree(list);

        System.out.println(tree);
        tree.reverse();
        System.out.println(tree);
    }

}
