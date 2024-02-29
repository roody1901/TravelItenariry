public class Main {
    public static void main(String[] args) {


        Activity activity1 = new Activity("Hiking","you will do hike here",70,5);
        Activity activity2 = new Activity("Ski","Learn  skiing here",50,2);

        Destination destination1 = new Destination("Himachal");
        destination1.addActivity(activity1);
        destination1.addActivity(activity2);

        Passenger passenger1 = new Passenger("Raj",001, Passenger.PassengerType.standard,200);
        Passenger passenger2 = new Passenger("Edwin",002, Passenger.PassengerType.gold,250);


        TravelPackage tp = new TravelPackage("Adventurer",2);
        tp.addDestination(destination1);
        tp.addPassenger(passenger1);
        tp.addPassenger(passenger2);

        System.out.println("----------Travel Package Detail Start --------------");
        tp.printItinerary();

        System.out.println("----------All Passenger Detail --------------");
        tp.printPassengerList();

        passenger1.signUpforActivities(activity1);

        System.out.println("----------Passenger Selected Activity details--------------");
        passenger1.passengerActivity();
    }
}