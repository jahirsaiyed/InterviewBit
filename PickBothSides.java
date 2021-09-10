package array;

public class PickBothSides {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5, -2, 3, 1, 2}, 3));
        System.out.println(solve(new int[]{1, 2}, 1));
    }

    public static int solve(int[] A, int B) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < B; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += A[j];
            }
            for (int j = 0; j < B - i; j++) {
                sum += A[A.length - j - 1];
            }
            if (sum > maxSum) maxSum = sum;
        }
        return maxSum;
    }
}

