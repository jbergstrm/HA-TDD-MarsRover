import java.util.ArrayList;
import java.util.List;

/**
 * Defining the 2D-Matrix.
 * MIN and MAX values for defining the border values.
 *
 * @author Joakim Bergström
 */
public final class Grid {

    /** Lower bound */
    public final static int MIN = 0;

    /** Higher bound */
    public final static int MAX = 5;

    /** List containing obstacles */
    private final static List<Point2d> OBSTACLE_POINTS = new ArrayList<>() {{
        add(new Point2d(2, 2));
        add(new Point2d(2, 3));
    }};

    /**
     * @return True if value equals the {@link Grid#MIN} bound.
     */
    public static boolean isMin(final int x) {
        return x == MIN;
    }

    /**
     * @return True if value equals the {@link Grid#MAX} bound.
     */
    public static boolean isMax(final int x) {
        return x == MAX;
    }

    /**
     * @return True if current point exists in the {@link Grid#OBSTACLE_POINTS} list.
     */
    public static boolean isObstacle(final Point2d point2d) {
        return OBSTACLE_POINTS.contains(point2d);
    }
}
