import java.util.List;

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
            case FORWARD, BACKWARD -> {
                currentPoint = Engine.move(command, currentPoint, currentDirection);
            }
            case LEFT, RIGHT -> {
                currentDirection = Engine.rotate(command, currentDirection);
            }
        }
    }

    @Override
    public void move(List<Command> commands) {
        commands.forEach(this::move);
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
}
