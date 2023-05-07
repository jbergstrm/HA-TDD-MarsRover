public interface MarsRover {
    void move(Command command);
    Point2d getCurrentPosition();
    Point2d getInitialPosition();
    Direction getInitialDirection();
}
