public class memoize {
    

    public int wizard_magic(int[] m, int[] t, int H, int n) {
        int[] memo = new int[H + 1];
        for (int i = 0; i <= H; i++) {
            memo[i] = -1;
        }

        return rec(m, t, H, n, memo);
    }


    private int rec(int[] m, int[] t, int H, int n, int[] memo) {
        if (H == 0) return 0;
        if (H < 0) return Integer.MIN_VALUE;  // impossible
        if (memo[H] != -1) return memo[H];
        

        // try all items in the magic kit
        int res = 0;
        for (int potion = 0; potion < n; potion++){
            int time_left = H - t[potion];
            res = Math.max(res, m[potion]+rec(m, t, time_left, n, memo));
        }
        memo[H] = res;
        return res;
    }

    public interface MagicSolver {
        int solve(int[] m, int[] t, int H, int n);
    }

    
    public static void main(String[] args) {
        memoize instance = new memoize(); 
        small_tests tester = new small_tests();
        System.out.println("running small tests");
        tester.small_test((m, t, H, n) -> instance.wizard_magic(m, t, H, n));
        big_tests btester = new big_tests();
        System.out.println("\nrunning big tests");
        btester.big_test((m, t, H, n) -> instance.wizard_magic(m, t, H, n));
    }

    
}
