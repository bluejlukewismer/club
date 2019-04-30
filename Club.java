
import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();

    }

    /**
     * Determine the number of members who joined in the
     * given month
     * @param month The month we are interested in.
     * @return The number of members.
     */
    public int joinedInMonth(int month)
    {
        int count = 0;
        if(month < 1 || month > 12) {
            System.out.println("Month " + month +
                " out of range. " +
                "It must be in the range 1 ... 12");
        }
        else {
            for(Membership member : members) {
                if(member.getMonth() == month) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numberOfMembers()
    {
        //return 0;
        return members.size();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    public void join(String name, int month, int year)
    {
        Membership member = new Membership(name,month,year);
        members.add(member);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    // public ArrayList purge(int month, int year)
    // {
        // ArrayList<Membership> purged = new ArrayList<Membership>();
        // if(month < 1 || month > 12) {
            // System.out.println("Month " + month +
                // " out of range. " +
                // "It must be in the range 1 to 12");
        // }
        // else {
             // it = members.iterator();
            // while(it.hasNext()) {
                // Membership member = it.next();
                // if(member.getMonth() == month && member.getYear() == year) {
                    // it.remove();
                    // purged.add(member);
                // }
            // }
        // }
        // return purged;
    // }

}
