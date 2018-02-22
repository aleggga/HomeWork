package transport;

public class Start {


    public static void main(String[] args) {
        Ticket ticketMaster = new Ticket();

        Train train1 = new Train();
        train1.setPassengersCapacity(389);
        train1.setNumber("U57");
        train1.setNumberOfVagons(9);

        AirJet airJet1 = new AirJet();
        airJet1.setPassengersCapacity(109);
        airJet1.setNumber("TK-238");
        airJet1.setJetType("Boing777");

        Car car1 = new Car();
        car1.setBrand("Toyota Avalon");
        car1.setBusinessClass(true);
        car1.setCarType("sedan");
        car1.setPassengersCapacity(3);
        car1.setNumber("ВН 5961 ТК");

        Vehicle[] transport = new Vehicle[] {train1, airJet1, car1};

        for (Vehicle a : transport) {
            ticketMaster.sellTickets(a);
            a.go();
            a.setStandBy(false);
            System.out.println("-------------------------------------------");
        }
    }
}
