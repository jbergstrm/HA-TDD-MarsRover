import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class MarsRoverTests {

    @Test
    public void testAssigningInitialStartLocation() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(0, 0), Direction.NORTH);
        Assertions.assertEquals(new Point2d(0, 0), rover.getInitialPosition());
    }

    @Test
    public void testAssigningInitialStartDirection() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(0, 0), Direction.NORTH);
        Assertions.assertEquals(Direction.NORTH, rover.getInitialDirection());
    }

    @Test
    public void testMoveForwardOneTimeDirectionNorth() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(0, 1), Direction.NORTH);
        rover.move(Command.FORWARD);
        Assertions.assertEquals(new Point2d(0, 0), rover.getCurrentPosition());
    }

    @Test
    public void testMoveForwardOneTimeDirectionEast() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(0, 0), Direction.EAST);
        rover.move(Command.FORWARD);
        Assertions.assertEquals(new Point2d(1, 0), rover.getCurrentPosition());
    }

    @Test
    public void testMoveForwardOneTimeDirectionSouth() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(0, 0), Direction.SOUTH);
        rover.move(Command.FORWARD);
        Assertions.assertEquals(new Point2d(0, 1), rover.getCurrentPosition());
    }

    @Test
    public void testMoveForwardOneTimeDirectionWest() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(1, 0), Direction.WEST);
        rover.move(Command.FORWARD);
        Assertions.assertEquals(new Point2d(0, 0), rover.getCurrentPosition());
    }

    @Test
    public void testMoveBackwardOneTimeDirectionNorth() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(0, 0), Direction.NORTH);
        rover.move(Command.BACKWARD);
        Assertions.assertEquals(new Point2d(0, 1), rover.getCurrentPosition());
    }

    @Test
    public void testMoveBackwardOneTimeDirectionEast() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(1, 0), Direction.EAST);
        rover.move(Command.BACKWARD);
        Assertions.assertEquals(new Point2d(0, 0), rover.getCurrentPosition());
    }

    @Test
    public void testMoveBackwardOneTimeDirectionSouth() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(0, 1), Direction.SOUTH);
        rover.move(Command.BACKWARD);
        Assertions.assertEquals(new Point2d(0, 0), rover.getCurrentPosition());
    }

    @Test
    public void testMoveBackwardOneTimeDirectionWest() {
        final MarsRover rover = new MarsRoverImpl(new Point2d(0, 0), Direction.WEST);
        rover.move(Command.BACKWARD);
        Assertions.assertEquals(new Point2d(1, 0), rover.getCurrentPosition());
    }

    @Test
    @Disabled
    public void testMoveForwardOneTimeLeftEdgeToRightEdge() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Point2d(0, 3), Direction.WEST);

        //Act
        rover.move(Command.FORWARD);

        //Assert
        Assertions.assertEquals(new Point2d(5, 3), rover.getCurrentPosition());
    }
}
