public class Max {
    public static int getMax(int[] m) {
        int max = 0;
        for (int i = 0; i < m.length; i++) {
            if (max < m[i]) {
                max = m[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] m = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(getMax(m));
    }
}
