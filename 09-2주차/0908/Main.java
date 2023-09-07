public class Main {

    public static int solution(int start, int end) {
        return isPrimeSolution(start, end);
    }

    private static int isPrimeSolution(int start, int end) {
        int count = 0;

        return count;
    }

    private static boolean isPrime(int num) {

        return true;
    }

    public static void main(String[] args) {
        for (int i = 0; i < TEST_CASES.length; i++) {
            System.out.println("Test Case " + (i + 1) + " = " + test(TEST_CASES[i][0], TEST_CASES[i][1], TEST_CASES_RESULTS[i]));
        }

        System.out.printf("정답률 = %.3f%%", (correct / TEST_CASES.length * 100));
    }




    private static boolean test(int start, int end, int result) {
        if (solution(start, end) == result) {
            correct++;
            return true;
        }

        return false;
    }


    private static double correct = 0;

    private static final int[][] TEST_CASES = {
            {1, 10},
            {1, 50},
            {1, 1000},
            {1, 100000},
            {5, 20},
            {11, 123},
            {55, 5555},
            {1000, 100000}
    };

    private static final int[] TEST_CASES_RESULTS = {
            4,
            15,
            168,
            9592,
            6,
            26,
            716,
            9424
    };

}