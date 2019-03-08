import java.util.ArrayList;
import java.util.Scanner;

class DonationRunner {

    private static Scanner myScan;
    private static String[][] donations;
    private static Silver mySilver;
    private static Gold myGold;
    private static Platinum myPlatinum;

    public static void donate() {
        System.out.println("Enter donor name --> ");
        String donorName = myScan.nextLine();
        System.out.println("Enter donation amount ($100, $500, $1000) --> ");
        String donationAmount = myScan.nextLine();

        donations[1][donations[1].length] = donorName;
        donations[2][donations[2].length] = donationAmount;

        System.out.println("Enter Another [Y/N]? ");
        if (myScan.nextLine().equals("Y"))
            donate();
        else
            return;
    }

    public static void main(String[] args) {
        myScan = new Scanner(System.in);
        donations = new String[2][1084];
        donate();

        System.out.println("Summary of Donations\n====================");
        for (int i = 0; i < donations[1].length; i++) {
            if (donations[2][i].equals("$100")) {
                mySilver = new Silver(donations[1][i]);
                System.out.println(mySilver.toString() + "\n");
            } else if (donations[2][i].equals("$500")) {
                myGold = new Gold(donations[1][i]);
                System.out.println(myGold.toString() + "\n");
            } else if (donations[2][i].equals("$1000")) {
                myPlatinum = new Platinum(donations[1][i]);
                System.out.println(myPlatinum.toString() + "\n");
            } else {
                System.out.println("Donation Error: " + donations[2][i] + "\n");
            }
        }
    }
}