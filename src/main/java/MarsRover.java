public interface MarsRover {
    void move(Command command);
    Point2d getCurrentPosition();
    Direction getCurrentDirection();
    Point2d getInitialPosition();
    Direction getInitialDirection();
}
