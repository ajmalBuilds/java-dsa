import java.util.*;
public class IntersectionOfArrays {
    public void swap(int[] nums1, int i, int min) {
        int temp = nums1[i];
        nums1[i] = nums1[min];
        nums1[min] = temp;
    }
    public void sort(int[] nums1, int[] nums2) {
        for(int i = 0; i < nums1.length - 1; i++) {
            int min = i;
            for(int j = i+1; j < nums1.length ; j++) {
                if (nums1[j] < nums1[min]) {
                    min = j;
                }
            }
            swap(nums1, i, min);
        }
        for(int i = 0; i < nums2.length - 1;i++) {
            int min = i;
            for(int j = i+1; j < nums2.length; j++) {
                if (nums2[j] < nums2[min]) {
                    min = j;
                }
            }
            swap(nums2, i, min);
        }
    }

    public ArrayList<Integer> search(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
       int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[i]){
                if(list.contains(nums1[i])) {
                    i++;
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
       return list;
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        sort(nums1, nums2);
        ArrayList<Integer> res = search(nums1, nums2);
        System.out.println(res);
        
        

        return new int[]{-1,-1};     
    }
    public static void main(String[] args) {
        IntersectionOfArrays obj = new IntersectionOfArrays();
        int[] nums1 = { 4,7,6,2,3,4,9,1,2,3,5,3 };
        int[] nums2 = { 3, 5, 7,1};
        int[] result = obj.intersection(nums1, nums2);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}