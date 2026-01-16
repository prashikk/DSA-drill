import java.util.Set;
import java.util.LinkedHashSet;

public class IntersectionofTwoArrays {

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i = 0 ; i < nums1.length ; i++){
            for(int j = 0 ; j < nums2.length ; j++){
                if(nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                    nums2[j] = -1;
                }
            }
        }
        int [] res = new int[set.size()];
        int index = 0;
        for(int element : set){
            res[index] = element;
            index--;
        }
        return res;
    }
    public static void main(String [] args){
        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};
        int [] res = intersection(nums1, nums2);
        for(int i = 0 ; i < res.length ; i++){
            System.out.println(res[i] + " ");
        }
    }
}
