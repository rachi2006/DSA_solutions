# Deque Implementation

## Difficulty: Easy

## Platform: GeeksForGeeks

## Problem Link
[View Problem](https://www.geeksforgeeks.org/problems/deque-implementations/1?page=3&category=Java&sortBy=submissions)

## Solved On
26 Jul 2026 at 02:01 pm

<h2><a href="https://www.geeksforgeeks.org/problems/deque-implementations/1?page=3&category=Java&sortBy=submissions">Deque Implementation</a></h2><h3>Difficulty Level: Easy</h3><hr><p><span style="font-size: 18px;">A deque is a double-ended queue that allows enqueue and dequeue operations from both the ends.</span></p>
<p><span style="font-size: 18px;">Given a deque and <strong>q</strong> queries. The task is to perform some operation on dequeue according to the queries as given below:<br>1.<strong> pb</strong>: query to push back the element x.<br>2.<strong> pf</strong>: query to push element x(given with query) to the front of the deque.<br>3.<strong> pp_b()</strong>: query to delete element from the back of the deque.<br>4.<strong> f</strong>: query to return a front element from the deque. If the deque is empty return -1.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>queries = [[ pf 5 ],[ pf 10 ],[ pb 6 ],[ f ],[ pp_b ]]
<strong>Output:</strong> 10
<strong>Explanation:</strong> 
1. After push front deque will be [5]
2. After push front deque will be [10, 5]
3. After push back deque will be [10, 5, 6]
4. Return front element which is 10
5. After pop back deque will be [10, 5]</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:</strong> queries = [[ pf 5 ],[ f ]]
<strong>Output:</strong> 5 
<strong>Explanation:</strong>
1. After push front deque will be [5]
2. Return front element which is 5
</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ Number of queries ≤ 10<sup>5</sup></span></p>