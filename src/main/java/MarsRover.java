import java.util.List;

public interface MarsRover {
    /**
     * @return True if move was successful
     */
    boolean move(Command command);
    void move(List<Command> commands);
    Point2d getCurrentPosition();
    Direction getCurrentDirection();
    Point2d getInitialPosition();
    Direction getInitialDirection();
}
