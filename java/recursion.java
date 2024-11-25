public class recursion {


    public int wizard_magic(int []m, int[] t, int H, int n){
        // base case when time is 0
        if (H == 0) return 0;
        if (H < 0) return Integer.MIN_VALUE;  // impossible
        
        // try all items in the magic kit
        int res = 0;
        for (int potion = 0; potion < n; potion++){
            int time_left = H - t[potion];
            res = Math.max(res, m[potion]+wizard_magic(m, t, time_left, n));
        }
        return res;
    }


    public interface MagicSolver {
        int solve(int[] m, int[] t, int H, int n);
    }


    public static void main(String[] args) {
        recursion instance = new recursion(); 
        small_tests tester = new small_tests();
        System.out.println("running small tests");
        tester.small_test((m, t, H, n) -> instance.wizard_magic(m, t, H, n));
        big_tests btester = new big_tests();
        System.out.println("\nrunning big tests");
        System.out.println("^NOT recommended for recursive solution");
        btester.big_test((m, t, H, n) -> instance.wizard_magic(m, t, H, n));
    }

}