public class Platinum extends Donation {
    // invokes Donation constructor
    public Platinum(String name) {
        super(name);
    }

    // returns amount required to join club
    @Override
    public double getAmount() {
        return 1000;
    }

    // returns club name
    @Override
    public String getClub() {
        return "Platinum";
    }
}