public interface Athlete {
    String getName();
    int getAge();
    String getSport();
    void train();
    int getMissedDays();  // Track missed class days
    void addMissedDay();  // Increment missed class days
}
