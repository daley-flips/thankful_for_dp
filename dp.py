# =============================================================================
# =============================================================================
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
#
#
#
#
#
import time
start = time.time()
# =============================================================================
# tests
# =============================================================================
# 1
t = [6,3,4,2]
magic = [30,14,16,9]
n = 4
ex = [0,0,9,14,18,23,30,32,39,44,48]
passed = True
for hours in range(11):
    if ex[hours] != wizard_magic(magic, t, hours, n):
        passed = False
if passed:
    print('\npassed test case 1')
else:
    print('\nfailed test case 1')
# =============================================================================
# 2   
t = [2, 3]
magic = [10, 15]
n = 2
ex = [0, 0, 10, 15, 20, 25, 30, 35, 40, 45]
passed = True
for hours in range(10):
    if ex[hours] != wizard_magic(magic, t, hours, n):
        passed = False 
if passed:
    print('passed test case 2')
else:
    print('failed test case 2')
# =============================================================================
# 3
t = [5]
magic = [20]
n = 1
ex = [0, 0, 0, 0, 0, 20, 20, 20, 20, 20]
passed = True
for hours in range(10):
    if ex[hours] != wizard_magic(magic, t, hours, n):
        passed = False 
if passed:
    print('passed test case 3')
else:
    print('failed test case 3')
# =============================================================================
# 4
t = [3, 3, 3]
magic = [10, 10, 10]
n = 3
ex = [0, 0, 0, 10, 10, 10, 20, 20, 20, 30]
passed = True
for hours in range(10):
    if ex[hours] != wizard_magic(magic, t, hours, n):
        passed = False 
if passed:
    print('passed test case 4')
else:
    print('failed test case 4')
# =============================================================================
# 5
t = [2, 4]
magic = [15, 30]
n = 2
ex = [0, 0, 15, 15, 30, 30, 45, 45, 60, 60]
passed = True
for hours in range(10):
    if ex[hours] != wizard_magic(magic, t, hours, n):
        passed = False 
if passed:
    print('passed test case 5')
else:
    print('failed test case 5')
# =============================================================================
# 6
t = [2, 3]
magic = [10, 15]
n = 2
ex = [0]
if ex[0] != wizard_magic(magic, t, 0, n):
    print('failed test case 6')
else:
    print('passed test case 6')
# =============================================================================
# 7
t = [1, 2]
magic = [5, 10]
n = 2
ex = [i * 5 for i in range(21)]  # All potions have t = 1, max magic is proportional to hours
passed = True
for hours in range(10):
    if ex[hours] != wizard_magic(magic, t, hours, n):
        passed = False 
if passed:
    print('passed test case 7\n')
else:
    print('failed test case 7\n')
# =============================================================================
# 8
t = [65, 60, 45, 40, 35, 33, 25, 20, 15, 10, 5]
magic = [61, 51, 42, 36, 34, 32, 25, 19, 13, 10, 8]
n = 11
H = 100000
ex = 168
if ex != wizard_magic(magic, t, H, n):
    print('failed test case 8\n')
else:
    print('passed test case 8\n')
# =============================================================================

end = time.time()
print(f'elapsed time: {round((end-start),2)} seconds')








