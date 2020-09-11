package duke.command;

/**
 * A standard set of command types.
 */
public enum CommandType {
    BYE("bye"),
    LIST("list"),
    DONE("done"),
    DELETE("delete"),
    TODO("todo"),
    DEADLINE("deadline"),
    EVENT("event"),
    FIND("find"),
    LOAD("load"),
    CREATE("create");

    private final String label;

    /** Constructs the enums with a custom label. */
    CommandType(String label) {
        this.label = label;
    }
}
