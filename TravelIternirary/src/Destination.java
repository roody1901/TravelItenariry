import java.util.ArrayList;
import java.util.List;

public class Destination {
    private String destName;
    private List<Activity> activityList;

    public Destination(String destName) {
        this.destName = destName;
        activityList = new ArrayList<>();
    }
    public void addActivity(Activity activity){
        activityList.add(activity);
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public List<Activity> getActivityList() {
        return activityList;
    }
}
