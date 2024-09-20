// FootballPlayer.java
public class BasketballPlayer implements Athlete {
    private String name;
    private int age;
    private String position;
    private int missedDays;

    public BasketballPlayer(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.missedDays = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSport() {
        return "Football";
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void train() {
        System.out.println(name + " is training for football.");
    }

    @Override
    public int getMissedDays() {
        return missedDays;
    }

    @Override
    public void addMissedDay() {
        missedDays++;
    }
}