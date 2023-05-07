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

    /**
     * @return True if value equals the {@link Grid#MIN} bound.
     */
    public static boolean isMin(final int x) {
        return x == MIN;
    }

    /**
     * @return True if value equals the {@link Grid#MAX} bound
     */
    public static boolean isMax(final int x) {
        return x == MAX;
    }
}
