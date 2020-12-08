/**
 * the adapter class. We extend it from our desired class.
 * It allows fitting square blocks into round holes. (since we can use objects of this class at roundBlock function calls.
 */

public class SquareBlockAdapter extends RoundBlock{
    private SquareBlock block;

    public SquareBlockAdapter(SquareBlock block){
        this.block = block;
    }

    /**
     *
     * @return a minimum circle radius which can fit the squareBlock.
     * (using the diagonal measures of the squareBlock)
     * diagonal = sqrt( 2* (width)² )
     * result = diagonal / 2 (since we want the radius)
     */

    @Override
    public double getRadius() {
        double result;
        double resultDiagonal;

        resultDiagonal = (Math.sqrt(Math.pow(block.getWidth(), 2)* 2));
        result = resultDiagonal / 2;
        return result;
    }
}
