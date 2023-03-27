package inheritance.homeworke4;

public class Car {
    private int passengerCount;
    private char engineType;
    public int getPassengerCount() {
        return passengerCount;
    }

    public Car(){
        passengerCount = 2;
        engineType = 'a';
    }
    public void setPassengerCount(char engineType) {
        if (passengerCount >= 2){
            this.passengerCount = passengerCount;
        }else System.out.println("Passengers doesn't >=2 ");
    }

    public char getEngineType() {
        return engineType;
    }

    public Car(char engineType) {
        this.passengerCount =passengerCount;
        this.engineType = engineType;
    }

    public void setEngineType(char engineType) {
        if ( Character.isLetter(engineType)){
            this.engineType = engineType;
        }else System.out.println("Engine type isn't  a-z A-Z");
    }
}
