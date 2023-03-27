package inheritance.homeworke5;

public class User {
    private Adress adress;
    private String frstName;
    private  int id;

    public User(Adress adress, String frstName, int id) {
        this.adress = adress;
        this.frstName = frstName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Adress getAdress() {
        return adress;
    }

    public String getFrstName() {
        return frstName;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFrstName(String frstName) {
        this.frstName = frstName;
    }
}
