package part_08;

/**
 * Created by daniel on 18.07.17.
 */
public class TryCatch {
    public static void main(String[] args) {
        int nums[]=new int[5];
        try {
            populateArray(nums);
        } catch (IndexOutOfBoundsException e){
            System.out.println("Exception caught");
        }
    }
    static void populateArray(int nums[]){
        for (int i = 0; i <= nums.length; i++) {
            nums[i] = i;
        }
    }
}
