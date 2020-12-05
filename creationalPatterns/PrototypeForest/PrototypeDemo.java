import java.util.ArrayList;
import java.util.List;

public class PrototypeDemo {

    public static void main(String[] args) {
        List<Tree> trees = new ArrayList<>();
        List<Tree> treesCopy = new ArrayList<>();

        BirchTree birchTree = new BirchTree();
        birchTree.age = 20;
        birchTree.height = 30;
        birchTree.type = "old birch";
        trees.add(birchTree);

        BirchTree birchTree1 = (BirchTree) birchTree.copy();
        trees.add(birchTree1);

        OakTree oakTree = new OakTree();
        oakTree.age = 10;
        oakTree.height = 15;
        oakTree.hasOakResin = true;
        trees.add(oakTree);

        OakTree oakTree1 = (OakTree) oakTree.copy();
        trees.add(oakTree1);

        compare(trees, treesCopy);

    }

    private static void compare(List<Tree> trees, List<Tree> treesCopy) {
        for (Tree tree : trees) {
            treesCopy.add(tree.copy());
        }

        for (int i = 0; i < trees.size(); i++) {
            if (trees.get(i) != treesCopy.get(i)) {
                System.out.println(i + " they are different objects! (good)");
                if (trees.get(i).equals(treesCopy.get(i))) {
                    System.out.println(i + " they are identical! (good)");
                } else {
                    System.out.println(i + " they are not identical! (bad)");
                }
            } else {
                System.out.println(i + " they are the same object! (bad)");
            }
        }
    }

}
