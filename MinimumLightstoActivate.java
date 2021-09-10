package array;

public class MinimumLightstoActivate {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{0, 0, 1, 1, 1, 0, 0, 1}, 3));
        System.out.println(solve(new int[]{0, 0, 0, 1, 0}, 3));
        System.out.println(solve(new int[]{1, 1, 1, 1}, 3));
        System.out.println(solve(new int[]{1, 1, 1}, 6));
        System.out.println(solve(new int[]{0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0}, 12));
    }

    public static int solve(int[] A, int B) {
        int minLightsReq = 0;
        int curBulb = 0;
        boolean bulbFound = false;
        while (curBulb < A.length - 1) {
            for (int i = Math.min(curBulb + B - 1, A.length - 1); i > 0; i--) {
                if (A[i] == 1) {
                    bulbFound = true;
                    curBulb = Math.min(i + B, A.length - 1);
                    minLightsReq++;
                    break;
                }
            }
            if (!bulbFound) return -1;
        }
        return minLightsReq;
    }

}
