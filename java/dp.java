public class dp {
    

    public int wizard_magic(int[] m, int[] t, int H, int n) {
        int[] dp = new int[H + 1];  // dp array to store results
        
        // bottom up loop
        for (int hours = 0; hours <= H; hours++) {
            // try each potion, save the max value
            int max_subproblem = 0;
            for (int potion = 0; potion < n; potion++) {
                if (hours - t[potion] >= 0) {  // ensure that we have time
                    max_subproblem = Math.max(max_subproblem, 
                                             m[potion] + dp[hours - t[potion]]);
                }
            }
            dp[hours] = max_subproblem;
        }
        return dp[H];
    }


    public interface MagicSolver {
        int solve(int[] m, int[] t, int H, int n);
    }

    
    public static void main(String[] args) {
        dp instance = new dp(); 
        small_tests tester = new small_tests();
        System.out.println("running small tests");
        tester.small_test((m, t, H, n) -> instance.wizard_magic(m, t, H, n));
        big_tests btester = new big_tests();
        System.out.println("\nrunning big tests");
        btester.big_test((m, t, H, n) -> instance.wizard_magic(m, t, H, n));
    }

    
}


