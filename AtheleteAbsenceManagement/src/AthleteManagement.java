import java.util.ArrayList;
import java.util.List;

public class AthleteManagement {
    private List<Athlete> athletes = new ArrayList<>();

    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public void trackTraining() {
        for (Athlete athlete : athletes) {
            athlete.train();
        }
    }

    public void reportAbsences() {
        for (Athlete athlete : athletes) {
            System.out.println(athlete.getName() + " has missed " + athlete.getMissedDays() + " days.");
        }
    }

    public void incrementMissedDay(String name) {
        for (Athlete athlete : athletes) {
            if (athlete.getName().equals(name)) {
                athlete.addMissedDay();
                System.out.println(name + " has missed another day.");
            }
        }
    }
}

