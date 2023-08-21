public class Player {
    private final String name;
    private final String valueAssigned;

    public Player(String name, String valueAssigned) {
        this.name = name;
        this.valueAssigned = valueAssigned;
    }

    public String getName() {
        return name;
    }

    public String getValueAssigned() {
        return valueAssigned;
    }

    @Override
    public String toString() {
        return this.name + " - Assigned Value: " + this.valueAssigned;
    }
}
