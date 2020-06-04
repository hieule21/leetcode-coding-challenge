# June Leetcode 30-day Challenge

Below are how I approach problems and what I learned when solving LeetCode problems Starting from **June 1st**. The number indicate the date.

## Table of Content

| Day | Problem                                                                                                               | Difficulty | My Solution                                                                                                                               | Complexity Analysis|
| --- | --------------------------------------------------------------------------------------------------------------------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------- |--------------------|                  
| 1   | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)                                               | Easy       | [invertBinaryTree.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/01-invertBinaryTree.java)               |Time: O(1) - Space: O(n)|                                                                              |
| 2   | [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)                           | Easy       | [deleteNodeInALinkedList.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/02-deleteNodeInALinkedList.java) |Time: O(1) - Space: O(1)|
| 3   | [Two City Scheduling](https://leetcode.com/problems/two-city-scheduling/)                                             | Easy       | [twoCitySchedCost.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/03-twoCityScheduling.java)              |Time: O(nlogn) - Space: O(n)|
| 4   |                                                                                                                       |            |                                                                                                                                           |                    |
| 5   |                                                                                                                       |            |                                                                                                                                           |                    |
| 6   |                                                                                                                       |            |                                                                                                                                           |                    |
| 7   |                                                                                                                       |            |                                                                                                                                           |                    |
| 8   |                                                                                                                       |            |                                                                                                                                           |                    |
| 9   |                                                                                                                       |            |                                                                                                                                           |                    |
| 10  |                                                                                                                       |            |                                                                                                                                           |                    |
| 11  |                                                                                                                       |            |                                                                                                                                           |                    |
| 12  |                                                                                                                       |            |                                                                                                                                           |                    |
| 13  |                                                                                                                       |            |                                                                                                                                           |                    |
| 14  |                                                                                                                       |            |                                                                                                                                           |                    |  
| 15  |                                                                                                                       |            |                                                                                                                                           |                    |
| 16  |                                                                                                                       |            |                                                                                                                                           |                    |
| 17  |                                                                                                                       |            |                                                                                                                                           |                    |
| 18  |                                                                                                                       |            |                                                                                                                                           |                    |
| 19  |                                                                                                                       |            |                                                                                                                                           |                    |
| 20  |                                                                                                                       |            |                                                                                                                                           |                    |  
| 21  |                                                                                                                       |            |                                                                                                                                           |                    |
| 22  |                                                                                                                       |            |                                                                                                                                           |                    |
| 23  |                                                                                                                       |            |                                                                                                                                           |                    |
| 24  |                                                                                                                       |            |                                                                                                                                           |                    |
| 25  |                                                                                                                       |            |                                                                                                                                           |                    | 
| 26  |                                                                                                                       |            |                                                                                                                                           |                    |   
| 27  |                                                                                                                       |            |                                                                                                                                           |                    | 
| 28  |                                                                                                                       |            |                                                                                                                                           |                    |
| 29  |                                                                                                                       |            |                                                                                                                                           |                    |
| 30  |                                                                                                                       |            |                                                                                                                                           |                    |

## [invertBinaryTree](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/01-invertBinaryTree.java)

1. We invert left node and right node first. 

2. Use **Postorder** traversal (left -> right -> root).

## [deleteNodeInALinkedList](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/02-deleteNodeInALinkedList.java)

1. We are given the node with its position and value. 

2. Take value from the next node and skip it.

## [twoCitySchedCost](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/02-deleteNodeInALinkedList.java)

1. Construct an array with elements being the subtraction between the cost to city B and the cost to city A.

2. Negative element tells us that it is cheaper to go to city B.

3. Sort the array to get the cheapest costs to send N people to city B (the other N people go to city A).

4. Add all the costs for 2N people going to city A then substract the cheapest cost.
