public class BinarySearch {
    public static int BinarySearch(int[] a, int target){
        int i = 0, j = a.length-1;
        while (i <= j) { //can not write i<j
            int m = (i+j)/2;
            if (a[m]==target) {
                return m;
            }
            if (a[m]<target) {
                i = m+1;
            }
            if (a[m]>target) {
                j = m-1;
            }
        }
        return -1;
    }

     public static void main(String[] args) {
        int[] a = {1,2,3,5,7,8};
        int n = BinarySearch(a, 3);
        System.out.println(n);
     }
}
