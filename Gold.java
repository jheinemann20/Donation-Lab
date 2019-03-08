public class Gold extends Donation {
    // invokes Donation constructor
    public Gold(String name) {
        super(name);
    }

    // returns amount required to join club
    @Override
    public double getAmount() {
        return 500;
    }

    // returns club name
    @Override
    public String getClub() {
        return "Gold";
    }
}