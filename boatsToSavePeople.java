import java.util.Arrays;
public class boatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        int left=0;
        int right=people.length-1;
        int boat=0;
        Arrays.sort(people);
        while(left<=right){
            if((people[left]+people[right])<=limit){
                boat+=1;
                right--;
                left++;
            }else{
                boat+=1;
                right--; // if weight of 2people is high, then send heavier person alone so that lighter person can be sent with other person as it is sorted
            }
        }
        return boat;
    }
}
