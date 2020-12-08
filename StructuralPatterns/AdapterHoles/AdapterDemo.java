/**
 * demo class for adapter pattern.
 *
 * the idea here is that we have a squareBlock and want to push that thru a roundHole. We therefore implemented the adapterClass SquareBlockAdapter.
 * That way we can call the hole.fits(squareBlockAdapterObject).
 */

public class AdapterDemo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundBlock roundBlock = new RoundBlock(5);

        if (hole.fits(roundBlock)){
            System.out.println("Round block with radius " + roundBlock.getRadius() + " fits the round hole of radius " + hole.getRadius()+ " .");
        } else
            System.out.println("Round block with radius " + roundBlock.getRadius() + " does not fit the round hole of radius " + hole.getRadius()+ " .");



        SquareBlock smallSquareBlock = new SquareBlock(2);
        SquareBlock largeSquareBlock = new SquareBlock(10);

        SquareBlockAdapter smallSquareAdapter = new SquareBlockAdapter(smallSquareBlock);
        SquareBlockAdapter largeSquareAdapter = new SquareBlockAdapter(largeSquareBlock);

        if (hole.fits(smallSquareAdapter)){
            System.out.println("Square block with radius " + smallSquareAdapter.getRadius() + " fits the round hole of radius " + hole.getRadius()+ " .");
        } else
            System.out.println("Square block with radius " + smallSquareAdapter.getRadius() + " does not fit the round hole of radius " + hole.getRadius()+ " .");


        if (hole.fits(largeSquareAdapter)){
            System.out.println("Square block with radius " + largeSquareAdapter.getRadius() + " fits the round hole of radius " + hole.getRadius()+ " .");
        } else
            System.out.println("Square block with radius " + largeSquareAdapter.getRadius() + " does not fit the round hole of radius " + hole.getRadius()+ " .");



    }
}
