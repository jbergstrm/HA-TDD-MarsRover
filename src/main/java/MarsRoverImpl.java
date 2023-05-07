public class MarsRoverImpl implements MarsRover {

    private final Point2d startingPoint;
    private final Direction startingDirection;

    private Point2d currentPoint;
    private Direction currentDirection;

    public MarsRoverImpl(final Point2d startingPoint, final Direction startingDirection){
        this.startingPoint = startingPoint;
        this.startingDirection = startingDirection;

        // Current point in the start always equals starting point
        this.currentPoint = this.startingPoint;

        // Current direction in the start always equals starting direction
        this.currentDirection = this.startingDirection;
    }

    @Override
    public void move(Command command){
        switch (command) {
            case FORWARD -> {
                forward(startingDirection);
            }
            case BACKWARD -> {
                backward(startingDirection);
            }
            case LEFT -> {
                left(startingDirection);
            }
        }
    }

    @Override
    public Point2d getCurrentPosition() {
        return currentPoint;
    }

    @Override
    public Direction getCurrentDirection() {
        return currentDirection;
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

    private void backward(final Direction direction) {
        switch (direction) {
            case NORTH -> {
                currentPoint = new Point2d(startingPoint.x(), startingPoint.y() + 1);
            }
            case EAST -> {
                currentPoint = new Point2d(startingPoint.x() - 1, startingPoint.y());
            }
            case SOUTH -> {
                currentPoint = new Point2d(startingPoint.x(), startingPoint.y() - 1);
            }
            case WEST -> {
                currentPoint = new Point2d(startingPoint.x() + 1, startingPoint.y());
            }
        }
    }

    private void left(final Direction direction) {
        switch (direction) {
            case NORTH -> {
                currentDirection = Direction.WEST;
            }
            case EAST -> {
                currentDirection = Direction.NORTH;
            }
            case SOUTH -> {
                currentDirection = Direction.EAST;
            }
            case WEST -> {
                currentDirection = Direction.SOUTH;
            }
        }
    }
}
