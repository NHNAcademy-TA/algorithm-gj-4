public class Main {

    private static double correctCount = 0;

    private static final String[][] TESTCASES = new String[][] {
            {"123", "123", "246"},
            {"1000", "1", "2"},
            {"456", "789", "1461"},
            {"5", "5", "1"},
            {"11112", "54321", "65433"},
            {"3829", "1300", "4139"}
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(String input, String input2, String answer) {
        int first = Integer.parseInt(input);
        int second = Integer.parseInt(input2);

        boolean res = String.valueOf(solution(first, second)).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

    // solution
    public static int solution(int a, int b) {
        
    }
}
