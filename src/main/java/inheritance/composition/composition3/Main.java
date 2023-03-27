package inheritance.composition.composition3;

public class Main {
    public static void main(String[] args) {
        Water water = new Water();
        Fish fish = new Fish(water);
        fish.getWater().aquariumINotEmpty();
    }
}
