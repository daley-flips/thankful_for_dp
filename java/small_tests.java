

public class small_tests {

    public interface MagicSolver {
        int solve(int[] magic, int[] time, int H, int n);
    }

    public void small_test(MagicSolver solver) {
        long start = System.currentTimeMillis();

        // =============================================================================
        // Test case 1
        int[] t1 = {6, 3, 4, 2};
        int[] magic1 = {30, 14, 16, 9};
        int n1 = 4;
        int[] ex1 = {0, 0, 9, 14, 18, 23, 30, 32, 39, 44, 48};
        boolean passed1 = true;
        for (int hours = 0; hours < 11; hours++) {
            if (ex1[hours] != solver.solve(magic1, t1, hours, n1)) {
                passed1 = false;
            }
        }
        System.out.println(passed1 ? "\npassed test case 1" : "\nfailed test case 1");

        // =============================================================================
        // Test case 2
        int[] t2 = {2, 3};
        int[] magic2 = {10, 15};
        int n2 = 2;
        int[] ex2 = {0, 0, 10, 15, 20, 25, 30, 35, 40, 45};
        boolean passed2 = true;
        for (int hours = 0; hours < 10; hours++) {
            if (ex2[hours] != solver.solve(magic2, t2, hours, n2)) {
                passed2 = false;
            }
        }
        System.out.println(passed2 ? "passed test case 2" : "failed test case 2");

        // =============================================================================
        // Test case 3
        int[] t3 = {5};
        int[] magic3 = {20};
        int n3 = 1;
        int[] ex3 = {0, 0, 0, 0, 0, 20, 20, 20, 20, 20};
        boolean passed3 = true;
        for (int hours = 0; hours < 10; hours++) {
            if (ex3[hours] != solver.solve(magic3, t3, hours, n3)) {
                passed3 = false;
            }
        }
        System.out.println(passed3 ? "passed test case 3" : "failed test case 3");

        // =============================================================================
        // Test case 4
        int[] t4 = {3, 3, 3};
        int[] magic4 = {10, 10, 10};
        int n4 = 3;
        int[] ex4 = {0, 0, 0, 10, 10, 10, 20, 20, 20, 30};
        boolean passed4 = true;
        for (int hours = 0; hours < 10; hours++) {
            if (ex4[hours] != solver.solve(magic4, t4, hours, n4)) {
                passed4 = false;
            }
        }
        System.out.println(passed4 ? "passed test case 4" : "failed test case 4");

        // =============================================================================
        // Test case 5
        int[] t5 = {2, 4};
        int[] magic5 = {15, 30};
        int n5 = 2;
        int[] ex5 = {0, 0, 15, 15, 30, 30, 45, 45, 60, 60};
        boolean passed5 = true;
        for (int hours = 0; hours < 10; hours++) {
            if (ex5[hours] != solver.solve(magic5, t5, hours, n5)) {
                passed5 = false;
            }
        }
        System.out.println(passed5 ? "passed test case 5" : "failed test case 5");

        // =============================================================================
        // Test case 6
        int[] t6 = {2, 3};
        int[] magic6 = {10, 15};
        int n6 = 2;
        int ex6 = 0;
        if (ex6 != solver.solve(magic6, t6, 0, n6)) {
            System.out.println("failed test case 6");
        } else {
            System.out.println("passed test case 6");
        }

        // =============================================================================
        // Test case 7
        int[] t7 = {1, 2};
        int[] magic7 = {5, 10};
        int n7 = 2;
        int[] ex7 = new int[21];
        for (int i = 0; i < ex7.length; i++) {
            ex7[i] = i * 5;
        }
        boolean passed7 = true;
        for (int hours = 0; hours < 10; hours++) {
            if (ex7[hours] != solver.solve(magic7, t7, hours, n7)) {
                passed7 = false;
            }
        }
        System.out.println(passed7 ? "passed test case 7" : "failed test case 7");

        // =============================================================================
        // Test case 8
        int[] t8 = {65, 60, 45, 40, 35, 33, 25, 20, 15, 10, 5};
        int[] magic8 = {61, 51, 42, 36, 34, 32, 25, 19, 13, 10, 8};
        int n8 = 11;
        int H8 = 105;
        int ex8 = 168;
        if (ex8 != solver.solve(magic8, t8, H8, n8)) {
            System.out.println("failed test case 8\n");
        } else {
            System.out.println("passed test case 8\n");
        }

        // =============================================================================

        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start) / 1000.0 + " seconds");
    }
    
}
