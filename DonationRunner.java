import java.util.ArrayList;
import java.util.Scanner;

class DonationRunner {

    private static Scanner myScan;
    private static ArrayList<ArrayList<String>> donations;
    private static Silver mySilver;
    private static Gold myGold;
    private static Platinum myPlatinum;

    public static void donate() {
        System.out.println("Enter donor name --> ");
        String donorName = myScan.nextLine();
        System.out.println("Enter donation amount ($100, $500, $1000) --> ");
        String donationAmount = myScan.nextLine();

        donations.get(0).add(donorName);
        donations.get(1).add(donationAmount);

        System.out.println("Enter Another [Y/N]? ");
        if (myScan.nextLine().equals("Y"))
            donate();
        else
            return;
    }

    public static void main(String[] args) {
        myScan = new Scanner(System.in);
        donations = new ArrayList<ArrayList<String>>();
        donations.add(new ArrayList<String>());
        donations.add(new ArrayList<String>());

        donate();

        System.out.println("Summary of Donations\n====================");
        for (int i = 0; i < donations.get(0).size(); i++) {
            if (donations.get(1).get(i).equals("$100")) {
                mySilver = new Silver(donations.get(0).get(i));
                System.out.println(mySilver.toString() + "\n");
            } else if (donations.get(1).get(i).equals("$500")) {
                myGold = new Gold(donations.get(0).get(i));
                System.out.println(myGold.toString() + "\n");
            } else if (donations.get(1).get(i).equals("$1000")) {
                myPlatinum = new Platinum(donations.get(0).get(i));
                System.out.println(myPlatinum.toString() + "\n");
            } else {
                System.out.println("Donation Error: " + donations.get(1).get(i) + "\n");
            }
        }
    }
}