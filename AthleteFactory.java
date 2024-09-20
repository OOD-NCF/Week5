public class AthleteFactory {
    public static Athlete createAthlete(String type, String name, int age, String attribute) {
        switch (type) {
            case "Football":
                return new FootballPlayer(name, age, attribute);  // Attribute could be "position"
            case "Basketball":
                return new BasketballPlayer(name, age, attribute);
            case "Swimming":
                return new Swimmer(name, age, attribute);  // Attribute could be "stroke type"
            case "Track":
                return new TrackAthlete(name, age, attribute);  // Attribute could be "event type"
            default:
                throw new IllegalArgumentException("Unknown athlete type");
        }
    }
}
