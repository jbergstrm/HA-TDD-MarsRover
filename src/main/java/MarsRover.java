import java.util.List;

public interface MarsRover {
    void move(Command command);
    void move(List<Command> commands);
    Point2d getCurrentPosition();
    Direction getCurrentDirection();
    Point2d getInitialPosition();
    Direction getInitialDirection();
}
