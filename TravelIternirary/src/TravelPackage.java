import java.util.ArrayList;
import java.util.List;

public class TravelPackage {
    private String packageName;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengerList;

    public List<Destination> getItinerary() {
        return itinerary;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public TravelPackage(String packageName, int passengerCapacity) {
        this.packageName = packageName;
        this.passengerCapacity = passengerCapacity;
        itinerary = new ArrayList<>();
        passengerList = new ArrayList<>();
    }
    public void addDestination(Destination destination){
        itinerary.add(destination);
    }
    public void addPassenger(Passenger passenger){
        if(passengerCapacity > passengerList.size()){
            passengerList.add(passenger);
        }
        else{
            System.out.println("Passenger limit has been reached for this package");
        }
    }
    public void printItinerary() {
        System.out.println("Travel Package: " + packageName);
        for (Destination destination : itinerary) {
            System.out.println("Destination: " + destination.getDestName());
            for (Activity activity : destination.getActivityList()) {
                System.out.println("Activity: " + activity.getName());
                System.out.println("Description: " + activity.getDescription());
                System.out.println("Cost: " + activity.getCost());
                System.out.println("Capacity: " + activity.getCapacity());
            }
        }
    }

    public void printPassengerList() {
        System.out.println("Travel Package: " + packageName);
        System.out.println("Passenger Capacity: " + passengerCapacity);
        System.out.println("Number of Passengers Enrolled: " + passengerList.size());
        System.out.println("Passenger List:");
        for (Passenger passenger : passengerList) {
            System.out.println("Name: " + passenger.getPasngrName() + ", PassengerNumber: " + passenger.getId() + ", Balance: " + passenger.getBalance());
        }
    }

}
