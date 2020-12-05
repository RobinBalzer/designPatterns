/**
 * this is the prototype class
 *
 * including a copy (== clone) method.
 * including a equals method that returns true if
 *  (the object is as instanceof the prototype class) AND
 *  (the properties of the object are equal to a freshly created copy)
 */

public abstract class Tree {
    public int age;
    public int height;

    public Tree(){

    }

    public Tree(Tree target) {
        if (target != null) {
            this.age = target.age;
            this.height = target.height;
        }
    }

    public abstract Tree copy();

    @Override
    public boolean equals(Object treeObject) {
        if (!(treeObject instanceof Tree)) return false;
        Tree treeCopy = (Tree) treeObject;
        return treeCopy.age == age && treeCopy.height == height;
    }
}
