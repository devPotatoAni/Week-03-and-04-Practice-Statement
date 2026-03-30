public class Question6 {

    static int floor(int[] arr, int target) {
        int res = -1;
        for (int x : arr) {
            if (x <= target) res = x;
        }
        return res;
    }

    static int ceil(int[] arr, int target) {
        for (int x : arr) {
            if (x >= target) return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        int target = 30;

        System.out.println("Floor: " + floor(arr, target));
        System.out.println("Ceiling: " + ceil(arr, target));
    }
}