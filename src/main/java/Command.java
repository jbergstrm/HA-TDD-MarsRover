/**
 * Commands that the MarsRover can process.
 *
 * @author Joakim Bergström
 */
public enum Command {

    FORWARD("f"),
    BACKWARD("b"),
    LEFT("l"),
    RIGHT("r");

    private final String value;

    Command(final String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
