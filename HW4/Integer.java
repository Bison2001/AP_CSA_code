public class Integer {

    private int value;

    public Integer(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }

    public int compareTo(Integer other) {
        if (this.value == other.intValue()) {
            return 0;
        }
        else if (this.value < other.intValue()) {
            return -1;
        }
        else {
            return 1;
        }
    }

    public boolean equals(Integer o) {
        return this.value == o.intValue();
    }
}
