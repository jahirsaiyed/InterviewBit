package array;

public class MinStepsinInfiniteGrid {

    public static void main(String[] args) {
        System.out.println(coverPoints(new int[]{0, 1, 1}, new int[]{0, 1, 2}));
    }

    public static int coverPoints(int[] A, int[] B) {
        Integer steps = 0;
        if(A.length <= 1 || B.length <=1) {
            return 0;
        }
        Integer curX = A[0];
        Integer curY = B[0];
        for (int i = 1; i < A.length; i ++) {
            if(A[i] > curX) {
                while(A[i] > curX) {
                    curX++;
                    steps++;
                    if(B[i] > curY) {
                        curY++;
                    } else if(B[i] < curY) {
                        curY--;
                    }
                }
            } else if(A[i] < curX) {
                while(A[i] < curX) {
                    curX--;
                    steps++;
                    if(B[i] > curY) {
                        curY++;
                    } else if(B[i] < curY) {
                        curY--;
                    }
                }
            }
            if(B[i] > curY) {
                while(B[i] > curY) {
                    steps++;
                    curY++;
                }
            } else if(B[i] < curY) {
                while(B[i] < curY) {
                    steps++;
                    curY--;
                }
            }
        }
        return steps;
    }
}
