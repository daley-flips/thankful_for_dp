

def wizard_magic(m, t, H, n):
    
    memo = [-1]*(H+1)
    
    
    def rec(m, t, H, n):
        
        # base case when time is 0
        if H == 0:
            return 0
        if H < 0:
            return float('-inf')  # impossible
        if memo[H] != -1:
            return memo[H]
        
        # try all items in the magic kit
        res = 0
        for potion in range(n):
            time_left = H - t[potion]
            res = max(res, m[potion]+rec(m, t, time_left, n))
        memo[H] = res
        return res
    
    
    return rec(m, t, H, n)
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