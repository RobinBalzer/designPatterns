public class OakTree extends Tree{
    public boolean hasOakResin;

    public OakTree(){

    }

    public OakTree(OakTree target){
        super(target);
        if (target != null){
            this.hasOakResin = target.hasOakResin;
        }
    }

    @Override
    public Tree copy() {
        return new OakTree(this);
    }

    @Override
    public boolean equals(Object oakTreeObject){
        if (!(oakTreeObject instanceof OakTree) || !super.equals(oakTreeObject)) return false;
        OakTree oakTreeCopy = (OakTree) oakTreeObject;
        return oakTreeCopy.hasOakResin == hasOakResin;
    }
}
