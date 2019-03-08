public class Silver extends Donation {
    // invokes Donation constructor
    public Silver(String name) {
        super(name);
    }

    // returns amount required to join club
    @Override
    public double getAmount() {
        return 100;
    }

    // returns club name
    @Override
    public String getClub() {
        return "Silver";
    }
}