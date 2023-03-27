package enumsTwo.home1.newVersi;

public enum TrafficLight {
    RED(4),
    YELLOW(2),
    GREEN(4);
    private int sec;

    TrafficLight(int sec) {
        this.sec = sec;
    }

    public int getSec() {
        return sec;
    }
}
