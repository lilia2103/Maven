package inheritance.composition.composition3;

public class Fish {
    private  Water water;

    public Fish(Water water) {
        this.water = water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Water getWater() {
        return water;
    }

}
