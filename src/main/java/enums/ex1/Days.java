package enums.ex1;

public enum Days {
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);
    private final String Days;
    private final int numberDay;
    public int getNumberDay(){
        return numberDay;
    }
    public String getDays(){
        return Days;
    }


    Days(String days, int numberDay) {
        Days = days;
        this.numberDay = numberDay;
    }
    public int getDayNumber(Days day) {
        switch (day) {
            case MONDAY:
                return 1;
            case TUESDAY:
                return 2;
            case WEDNESDAY:
                return 3;
            case THURSDAY:
                return 4;
            case FRIDAY:
                return 5;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 7;
            default:
                throw new IllegalArgumentException("Invalid day: " + day);
        }
    }
}
