public class MarsRoverImpl implements MarsRover {

    private final Point2d startingPoint;

    public MarsRoverImpl(final Point2d startingPoint, final Direction startingDirection){
        this.startingPoint = startingPoint;
    }

    @Override
    public void move(String commands){
        //TODO implement
    }

    @Override
    public Point2d getCurrentPosition() {
        //TODO implement
        return null;
    }

    @Override
    public Point2d getInitialPosition() {
        return startingPoint;
    }
}
