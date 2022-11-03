package comment.time;

public class Match {
    int number;
    public String group(int number) {
        this.number = number;
        return "  group string " + number;
    }

    public int end() {
        return this.number;
    }
}
