//leetcode
public class PeakIndexInMountainArray {
        public static int peakIndex(int[] arr) {
            int first = 0, last = arr.length - 1;
            while(first < last) {
                int mid = (first + last ) / 2;
                if (arr[mid] > arr[mid+1] && arr[mid] > arr[mid-1]) {
                    return mid;
                }
                if(arr[mid] < arr[mid+1]) {
                    first = mid;
                }
                if(arr[mid] > arr[mid+1]) {
                    last = mid;
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            int [] arr = {24,69,100,99,79,78,67,36,26,19};
            System.out.println(peakIndex(arr));
        }
}