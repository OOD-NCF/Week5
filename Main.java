public class Main {
    public static void main(String[] args) {
        AthleteManagement management = new AthleteManagement();

        // Create athletes
        Athlete footballPlayer = AthleteFactory.createAthlete("Football", "John", 21, "Quarterback");
        Athlete basketballPlayer = AthleteFactory.createAthlete("Basketball", "Sarah", 19, "Guard");

        // Add them to management
        management.addAthlete(footballPlayer);
        management.addAthlete(basketballPlayer);

        // Simulate training
        management.trackTraining();

        // Track missed days
        management.incrementMissedDay("John");
        management.incrementMissedDay("Sarah");
        management.incrementMissedDay("John");
        management.incrementMissedDay("John");
        management.incrementMissedDay("John");

        // Report absences
        management.reportAbsences();
    }
}
