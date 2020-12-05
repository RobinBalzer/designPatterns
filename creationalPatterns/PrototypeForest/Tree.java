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
