public class Location {
    private String value = "-";

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }

    @Override
    public boolean equals(Object obj) {
        Location location = (Location) obj;
        if (this.value == location.value && this.value != "-" && location.value != "-") {
            return true;
        }
        return false;
    }
}
