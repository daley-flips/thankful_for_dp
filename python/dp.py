

def wizard_magic(m, t, H, n):
    
    dp = [0]*(H+1)
    
    # bottom up loop
    for hours in range(H+1):
        # try each potion, save the max value
        max_subproblem = 0
        for potion in range(n):
            if hours - t[potion] >= 0:  # ensure that we have time
                max_subproblem = max(max_subproblem, 
                                     m[potion] + dp[hours - t[potion]])
        dp[hours] = max_subproblem
    return dp[H]
# =============================================================================
# ============================================================================= 
if __name__ == "__main__":
    import time
    from small_tests import small_test
    print('\nrunning first tests')
    time.sleep(0.5)
    small_test(wizard_magic) 
    
    from big_tests import big_test
    time.sleep(0.25)
    print('\nrunning bigger tests')
    time.sleep(0.25)
    time.sleep(0.5)
    big_test(wizard_magic) 


   
   