public class MarsRoverImpl implements MarsRover {

    private final Point2d startingPoint;
    private final Direction startingDirection;

    private Point2d currentPoint;

    public MarsRoverImpl(final Point2d startingPoint, final Direction startingDirection){
        this.startingPoint = startingPoint;
        this.startingDirection = startingDirection;

        // Current point in the start always equals starting point
        this.currentPoint = this.startingPoint;
    }

    @Override
    public void move(Command command){
        if (Command.FORWARD.equals(command)) {
            forward(startingDirection);
        }
    }

    @Override
    public Point2d getCurrentPosition() {
        return currentPoint;
    }

    @Override
    public Point2d getInitialPosition() {
        return startingPoint;
    }

    @Override
    public Direction getInitialDirection() {
        return startingDirection;
    }

    private void forward(final Direction direction) {
        switch (direction) {
            case NORTH -> {
                currentPoint = new Point2d(startingPoint.x(), startingPoint.y() - 1);
            }
            case EAST -> {
                currentPoint = new Point2d(startingPoint.x() + 1, startingPoint.y());
            }
            case SOUTH -> {
                currentPoint = new Point2d(startingPoint.x(), startingPoint.y() + 1);
            }
            case WEST -> {
                currentPoint = new Point2d(startingPoint.x() - 1, startingPoint.y());
            }
        }
    }
}
