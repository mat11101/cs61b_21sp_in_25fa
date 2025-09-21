public class BreakContinue {
    public static void windownPosSum(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                continue;
            }

            int MaxJ = Math.min(n, a.length - 1 - i);

            int cnt = a[i];
            for (int j = 1; j <= MaxJ; j++) {
                cnt += a[i+j];
            }
            a[i] = cnt;
        }
    }
    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windownPosSum(a, n);

        System.out.println(java.util.Arrays.toString(a));
    }
}
