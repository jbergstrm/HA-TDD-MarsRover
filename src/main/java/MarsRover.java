public interface MarsRover {
    void move(String commands);
    Point2d getCurrentPosition();
    Point2d getInitialPosition();
}
