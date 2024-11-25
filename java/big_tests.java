public class big_tests {


    public interface MagicSolver {
        int solve(int[] magic, int[] time, int H, int n);
    }

    public void big_test(MagicSolver solver) {
        long start = System.currentTimeMillis();
        // =============================================================================
        // 1
        int[] t1 = {207, 490, 952, 775, 88, 128, 797, 550, 842, 648, 302, 93, 129, 84, 501, 734, 183, 962, 401, 692, 638, 672, 330, 526, 662, 972, 759, 678, 126, 534, 478, 355, 31, 86, 285, 746, 609, 284, 242, 244, 723, 684, 923, 236, 554, 74, 827, 885, 196, 630};
        int[] magic1 = {207, 490, 952, 775, 88, 128, 797, 550, 842, 648, 302, 93, 129, 84, 501, 734, 183, 962, 401, 692, 638, 672, 330, 526, 662, 972, 759, 678, 126, 534, 478, 355, 31, 86, 285, 746, 609, 284, 242, 244, 723, 684, 923, 236, 554, 74, 827, 885, 196, 630};
        int n1 = 50;
        int H1 = 10000;
        int ex1 = 10000;
        if (ex1 != solver.solve(magic1, t1, H1, n1)) System.out.println("failed test case 1");
        else System.out.println("passed test case 1");
        // =============================================================================
        // =============================================================================
        // 2
        int[] t2 = {756, 255, 493, 260, 273, 723, 904, 661, 653, 803, 535, 60, 323, 157, 908, 829, 736, 666, 3, 132, 229, 180, 20, 198, 400, 237, 574, 544, 493, 221, 663, 723, 577, 18, 808, 256, 758, 303, 82, 700, 607, 222, 456, 953, 684, 7, 298, 936, 210, 543};
        int[] magic2 = {729, 621, 6, 16, 395, 898, 5, 314, 630, 515, 112, 653, 723, 429, 115, 192, 69, 80, 485, 604, 623, 565, 887, 831, 192, 31, 391, 456, 851, 784, 527, 159, 831, 672, 991, 409, 780, 21, 716, 586, 429, 844, 962, 186, 817, 9, 256, 926, 15, 597};
        int n2 = 50;
        int H2 = 10000;
        int ex2 = 1616505;
        if (ex2 != solver.solve(magic2, t2, H2, n2)) System.out.println("failed test case 2");
        else System.out.println("passed test case 2");
        // =============================================================================
        // 3
        int[] t3 = {539, 279, 68, 896, 827, 635, 185, 660, 379, 509, 418, 393, 95, 280, 236, 944, 523, 960, 163, 984, 810, 496, 68, 881, 9, 653, 376, 563, 153, 739, 963, 655, 584, 726, 580, 809, 598, 259, 486, 197, 928, 494, 914, 145, 867, 204, 465, 551, 700, 259};
        int[] magic3 = {387, 911, 814, 345, 875, 823, 441, 58, 751, 82, 412, 762, 511, 192, 810, 741, 246, 82, 586, 326, 371, 884, 173, 958, 235, 140, 114, 659, 622, 264, 308, 367, 219, 137, 164, 58, 74, 906, 548, 813, 438, 202, 609, 863, 940, 12, 789, 785, 49, 487};
        int n3 = 50;
        int H3 = 10000;
        int ex3 = 261085;
        if (ex3 != solver.solve(magic3, t3, H3, n3)) System.out.println("failed test case 3");
        else System.out.println("passed test case 3");
        // =============================================================================
        // 4
        int[] t4 = {629, 912, 477, 30, 78, 766, 707, 66, 788, 227, 642, 517, 924, 450, 526, 12, 289, 450, 343, 431, 948, 490, 446, 823, 322, 154, 192, 28, 630, 665, 391, 819, 407, 767, 579, 608, 797, 134, 139, 760, 901, 461, 762, 635, 273, 955, 618, 659, 551, 764, 872, 267, 52, 373, 737, 799, 465, 418, 403, 506, 771, 117, 652, 792, 900, 436, 375, 426, 783, 476, 443, 882, 768, 485, 621, 929, 310, 298, 233, 40, 535, 553, 964, 556, 445, 668, 710, 978, 466, 702, 626, 920, 317, 576, 531, 280, 647, 667, 869, 437};
        int[] magic4 = {374, 628, 468, 606, 735, 538, 939, 919, 4, 266, 681, 583, 658, 863, 90, 160, 690, 742, 175, 997, 29, 31, 587, 959, 846, 570, 578, 65, 790, 909, 296, 951, 51, 108, 489, 653, 333, 820, 893, 315, 243, 799, 554, 983, 831, 245, 991, 58, 684, 810, 869, 943, 579, 620, 164, 294, 462, 341, 853, 686, 785, 970, 53, 130, 116, 291, 851, 674, 338, 737, 477, 483, 872, 592, 585, 899, 475, 442, 291, 893, 518, 512, 90, 285, 990, 653, 70, 203, 395, 861, 144, 866, 685, 388, 350, 562, 837, 175, 202, 567};
        int n4 = 100;
        int H4 = 10000;
        int ex4 = 223250;
        if (ex4 != solver.solve(magic4, t4, H4, n4)) System.out.println("failed test case 4");
        else System.out.println("passed test case 4");
        // =============================================================================
        // running more to push the timer
        for(int i = 0; i < 1000; i++) solver.solve(magic4, t4, H4, n4);
        // =============================================================================
        
        long end = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (end - start) / 1000.0 + " seconds");
    }
    
}
