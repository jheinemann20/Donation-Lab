public abstract class Donation
{
    private String donorName;  // the donor's name
    
    public Donation(String name)
    {
       donorName = name;    
    }
    
    // returns the name of the club the donor belongs
    public abstract String getClub();

    // returns the amount of the donation
    public abstract double getAmount();
    
    // returns a string with information about the donation
    public String toString()
    {
        String str;
        str = "Donor Name      = " + donorName + "\n" +
              "Donation Club   = " + getClub() + "\n" +
              "Donation Amount = " + getAmount();
        return str;
    }
}