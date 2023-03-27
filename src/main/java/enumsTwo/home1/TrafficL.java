package enumsTwo.home1;

public enum TrafficL {
    RED{
        @Override
        public String change(TrafficL traffic) {
            return null;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    },
    YELLOW{
        @Override
        public String change(TrafficL traffic) {
            return null;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    },
    GREEN{
        @Override
        public String change(TrafficL traffic) {
            return null;
        }

        @Override
        public String toString() {
            return super.toString();
        }
    };

    private TrafficL traffic;

    public void setTraffic(TrafficL traffic) {
        this.traffic = traffic;
    }

    public TrafficL getTraffic() {
        return traffic;
    }
    public abstract String change(TrafficL traffic);
}
