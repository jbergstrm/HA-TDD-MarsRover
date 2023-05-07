/**
 * Engine for the MarsRover controls the movement and rotation.
 *
 * @author Joakim Bergström
 */
public class Engine {

    public static Point2d move(final Command command, final Point2d startPoint, final Direction startDirection) {
        return switch (command) {
            case FORWARD -> forward(startPoint, startDirection);
            case BACKWARD -> backward(startPoint, startDirection);

            // If it's not FORWARD or BACKWARD return the current point
            default -> startPoint;
        };
    }

    public static Direction rotate(final Command command, final Direction startDirection) {
        return switch (command) {
            case LEFT -> left(startDirection);
            case RIGHT -> right(startDirection);

            // If it's not LEFT or RIGHT return the current direction
            default -> startDirection;
        };
    }

    private static Point2d forward(final Point2d startPoint, final Direction direction) {
        return switch (direction) {
            case NORTH -> new Point2d(startPoint.x(), startPoint.y() - 1);
            case EAST -> new Point2d(startPoint.x() + 1, startPoint.y());
            case SOUTH -> new Point2d(startPoint.x(), startPoint.y() + 1);
            case WEST -> new Point2d(startPoint.x() - 1, startPoint.y());
        };
    }

    private static Point2d backward(final Point2d startPoint, final Direction direction) {
        return switch (direction) {
            case NORTH -> new Point2d(startPoint.x(), startPoint.y() + 1);
            case EAST -> new Point2d(startPoint.x() - 1, startPoint.y());
            case SOUTH -> new Point2d(startPoint.x(), startPoint.y() - 1);
            case WEST -> new Point2d(startPoint.x() + 1, startPoint.y());
        };
    }

    private static Direction left(final Direction direction) {
        return switch (direction) {
            case NORTH -> Direction.WEST;
            case EAST -> Direction.NORTH;
            case SOUTH -> Direction.EAST;
            case WEST -> Direction.SOUTH;
        };
    }

    private static Direction right(final Direction direction) {
        return switch (direction) {
            case NORTH -> Direction.EAST;
            case EAST -> Direction.SOUTH;
            case SOUTH -> Direction.WEST;
            case WEST -> Direction.NORTH;
        };
    }
 }
