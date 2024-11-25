

def wizard_magic(m, t, H, n):
    # base case when time is 0
    if H == 0:
        return 0
    if H < 0:
        return float('-inf')  # impossible
    
    # try all items in the magic kit
    res = 0
    for potion in range(n):
        time_left = H - t[potion]
        res = max(res, m[potion]+wizard_magic(m, t, time_left, n))
    return res
# =============================================================================
# =============================================================================
if __name__ == "__main__":
    import time
    from small_tests import small_test
    print('\nrunning first tests')
    time.sleep(0.5)
    small_test(wizard_magic) 
    
    # from big_tests import big_test
    # time.sleep(0.25)
    # print('\nrunning bigger tests')
    # print('^NOT recommended for recursive solution')
    # time.sleep(0.25)
    # time.sleep(0.5)
    # big_test(wizard_magic) 