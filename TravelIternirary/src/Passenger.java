import java.util.ArrayList;
import java.util.List;

public class Passenger {
    enum PassengerType{standard,gold,premium}
    private String pasngrName;
    private int id;
    final PassengerType type;
    private int balance;
    private List<Activity> activitiesList;

    public Passenger(String pasngrName, int id, PassengerType type, int balance) {
        this.pasngrName = pasngrName;
        this.id = id;
        this.type = type;
        this.balance = balance;
        activitiesList = new ArrayList<>();
    }

    public void signUpforActivities(Activity activity){
        if(type == PassengerType.standard){
            if(balance >= activity.getCost()){
                balance -= activity.getCost();
                activitiesList.add(activity);
            }
            else if (type == PassengerType.gold) {
                double discountedCost = activity.getCost()*0.9;
                if(balance >= discountedCost){
                    balance -= discountedCost;
                    activitiesList.add(activity);
                }
            }
            else{
                activitiesList.add(activity);
            }
        }
    }
    public void passengerActivity(){
        System.out.println("Passenger Name: " + getPasngrName());
        System.out.println("Passenger Type: " + getType());
        System.out.println("Left Balance: " + getBalance());
        System.out.println("Activity Name: " );
        for (Activity passenger : activitiesList) {
            System.out.println("Name: " + passenger.getName() + "Cost charged: " + passenger.getCost());
        }

    }


    public String getPasngrName() {
        return pasngrName;
    }

    public void setPasngrName(String pasngrName) {
        this.pasngrName = pasngrName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public PassengerType getType() {
        return type;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public List<Activity> getActivitiesList() {
        return activitiesList;
    }
}
