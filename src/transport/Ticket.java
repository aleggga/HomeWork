package transport;

public class Ticket {


    void sellTickets(Vehicle a) {
        int requiredTickets = a.getPassengersCapacity();

        while (requiredTickets != 0) {
            int random = (int)(Math.random()*3 + 1);
            if (requiredTickets >= random) {
                requiredTickets -= random;
                //System.out.println("Sold " + random + " ticket(s)"); // For debugging only
            }
        }
        System.out.println("\nAll tickets for " + a.getClass().getSimpleName() + " " + a.getNumber() + " are sold\n");
    }

    protected void getTime(){
        System.out.println("protected access example");
    }
}
