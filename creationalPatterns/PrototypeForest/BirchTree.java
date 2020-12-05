public class BirchTree extends Tree {

    public String type;

    public BirchTree() {

    }

    public BirchTree(BirchTree target) {
        super(target);
        if (target != null) {
            this.type = target.type;
        }
    }


    @Override
    public Tree copy() {
        return new BirchTree(this);
    }

    @Override
    public boolean equals(Object birchTreeObject) {
        if (!(birchTreeObject instanceof BirchTree) || !super.equals(birchTreeObject)) return false;
        BirchTree birchTreeCopy = (BirchTree) birchTreeObject;
        return birchTreeCopy.type.equals(type);
    }
}
