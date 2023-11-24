public class BinarySearch {
    public static int BinarySearch(int[] a, int target) {
        int i = 0, j = a.length - 1;
        while (i <= j) {
            int m = (i + j) / 2; // can use (i+j)>>>1
            if (a[m] == target) {
                return m;
            } else if (a[m] < target) {
                i = m + 1;
            } else if (target < a[m]) {
                j = m - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 5, 7, 8 };
        int n = BinarySearch(a, 3);
        System.out.println(n);
    }
}
