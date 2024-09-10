package GreedAlgo;

import java.util.Arrays;
import java.util.Comparator;
class Activity{


    
    int start;
    int end;
Activity(int start,int end){
    this.start=start;
    this.end=end;
}

}

public class ActivitySelection {
    public static void activitySelection(Activity activity[]){
        Arrays.sort(activity,new Comparator<Activity>(){
            public int compare(Activity a1,Activity a2){
                return Integer.compare(a1.end,a2.end);

            }
        });
        System.out.println(activity[0]);
        for (int i = 1; i < activity.length ; i++) {

            System.out.println(activity[i].start+" "+activity[i].end);
        }
    }

    public static void main(String[] args) {
        Activity activity[]={
                new Activity(5,6),
                new Activity(7,8),
                new Activity(1,2),
                new Activity(3,6),
        };
        activitySelection(activity);
    }
}
