public class MarsRoverImpl implements MarsRover {

    private final Point2d startingPoint;
    private final Direction startingDirection;

    public MarsRoverImpl(final Point2d startingPoint, final Direction startingDirection){
        this.startingPoint = startingPoint;
        this.startingDirection = startingDirection;
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

    @Override
    public Direction getInitialDirection() {
        return startingDirection;
    }
}
