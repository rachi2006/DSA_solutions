# Bishop Moves

## Difficulty: Medium

## Platform: Manual

## Problem Link
[View Problem](https://www.codechef.com/START250D/problems/BISHOPMV)

## Solved On
05 Aug 2026 at 09:28 pm


You have a chessboard of size 
8
×
8
8×8, where the cells are numbered 
(
1
,
1
)
,
(
1
,
2
)
,
…
,
(
1
,
8
)
,
…
,
(
8
,
1
)
,
…
,
(
8
,
8
)
.
(1,1),(1,2),…,(1,8),…,(8,1),…,(8,8).

A bishop is a chess piece which travels along diagonals (between any 
2
2 cells in the same diagonal in a single move). A diagonal can be of 
2
2 types:

a set of cells 
(
x
,
y
)
(x,y) where 
x
+
y
x+y is constant.
a set of cells 
(
x
,
y
)
(x,y) where 
x
−
y
x−y is constant.
For example, 
{
(
1
,
2
)
,
(
2
,
3
)
,
(
3
,
4
)
,
(
4
,
5
)
,
(
5
,
6
)
,
(
6
,
7
)
,
(
7
,
8
)
}
{(1,2),(2,3),(3,4),(4,5),(5,6),(6,7),(7,8)} form a diagonal.

You are given 
2
2 cells 
(
X
1
,
Y
1
)
(X 
1
​
 ,Y 
1
​
 ) and 
(
X
2
,
Y
2
)
(X 
2
​
 ,Y 
2
​
 ). Can a bishop starting in the first cell reach the second? If it can, what is the minimum number of moves.

Input Format
The first line of input will contain a single integer 
T
T, denoting the number of test cases.
The first and only line contains 
4
4 integers 
X
1
X 
1
​
 , 
Y
1
Y 
1
​
 , 
X
2
X 
2
​
  and 
Y
2
Y 
2
​
 .
Output Format
For each test case, output on a new line the minimum moves needed or 
−
1
−1 if impossible.

Constraints
1
≤
T
≤
100
1≤T≤100
1
≤
X
1
,
Y
1
,
X
2
,
Y
2
≤
8
1≤X 
1
​
 ,Y 
1
​
 ,X 
2
​
 ,Y 
2
​
 ≤8
(
X
1
,
Y
1
)
≠
(
X
2
,
Y
2
)
(X 
1
​
 ,Y 
1
​
 )=(X 
2
​
 ,Y 
2
​
 )
Sample 1:
Input
Output
4
1 2 7 8
2 1 1 2
1 2 3 6
1 2 2 2
1
1
2
-1
Explanation:
Test Case 1: 
(
1
,
2
)
(1,2) and 
(
7
,
8
)
(7,8) are on the same diagonal, and hence can be reached in 
1
1 move.

Test Case 3: The bishop can first go like 
(
1
,
2
)
→
(
4
,
5
)
→
(
3
,
6
)
(1,2)→(4,5)→(3,6), thus reaching in 
2
2 steps.


## My Notes / Approach:
