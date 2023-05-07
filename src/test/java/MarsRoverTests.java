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
    @Disabled
    public void testMoveForwardOneTimeLeftEdgeToRightEdge() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Point2d(0, 3), Direction.WEST);

        //Act
        rover.move("f");

        //Assert
        Assertions.assertEquals(new Point2d(5, 3), rover.getCurrentPosition());
    }
}
