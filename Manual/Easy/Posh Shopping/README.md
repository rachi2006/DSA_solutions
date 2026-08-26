# Posh Shopping

## Difficulty: Easy

## Platform: Manual

## Problem Link
[View Problem](https://www.codechef.com/START253D/problems/POSHOP)

## Solved On
26 Aug 2026 at 09:48 pm

There's a shop with 
N
N items. The cost of the 
i
i-th item is 
C
i
C 
i
​
 .
Chef wants to buy at most two of these 
N
N items.

Chef doesn't want to look poor, and so if he decides to buy two items, the cost of the second item must not be smaller than the cost of the first item.
That is, if Chef decides to buy items 
i
i and 
j
j, where 
i
<
j
i<j, then 
C
i
≤
C
j
C 
i
​
 ≤C 
j
​
  must hold.

If Chef decides to buy only one item, there is no such constraint: any item can be bought.

Your task is to find the maximum amount of money that Chef can spend at the shop, while buying at most two items.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
Each test case consists of two lines of input.
The first line of each test case contains a single integer 
N
N — the number of items.
The second line contains 
N
N space-separated integers 
C
1
,
…
,
C
N
C 
1
​
 ,…,C 
N
​
  — the costs of the items.
Output Format
For each test case, output on a new line the maximum amount Chef can spend.

Constraints
1
≤
T
≤
100
1≤T≤100
2
≤
N
≤
100
2≤N≤100
1
≤
C
i
≤
100
1≤C 
i
​
 ≤100
Sample 1:
Input
Output
3
3
2 1 6
4
10 4 2 5
4
2 12 7 8
8
10
15
Explanation:
Test case 
1
1: There are three items, with prices 
[
2
,
1
,
6
]
[2,1,6]. Chef can buy items 
1
1 and 
3
3, which is allowed because 
C
1
≤
C
3
C 
1
​
 ≤C 
3
​
 .
The total amount spent is 
2
+
6
=
8
2+6=8 which is the maximum possible.

Test case 
2
2: There are four items, with prices 
[
10
,
4
,
2
,
5
]
[10,4,2,5].
If Chef buys the first item, he cannot buy anything else - because everything after it is cheaper than it.
However, it's still optimal to buy only the first item rather than buy any two of the other items; so the answer is 
10
10.

Test case 
3
3: The prices are 
[
2
,
12
,
7
,
8
]
[2,12,7,8]. The optimal solution is to buy items 
3
3 and 
4
4, for a total cost of 
7
+
8
=
15
7+8=15.

## My Notes / Approach:
