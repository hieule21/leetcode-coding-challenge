# June Leetcode 30-day Challenge

Below are how I approach problems and what I learned when solving LeetCode problems Starting from **June 1st**. The number indicate the date.

## Table of Content

| Day | Problem                                                                                                               | Difficulty | My Solution                                                                                                                               | Complexity Analysis|
| --- | --------------------------------------------------------------------------------------------------------------------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------- |--------------------|                  
| 1   | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)                                               | Easy       | [invertBinaryTree.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/01-invertBinaryTree.java)               |Time: O(1) - Space: O(n)|
| 2   | [Delete Node in a Linked List](https://leetcode.com/problems/delete-node-in-a-linked-list/)                           | Easy       | [deleteNodeInALinkedList.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/02-deleteNodeInALinkedList.java) |Time: O(1) - Space: O(1)|
| 3   | [Two City Scheduling](https://leetcode.com/problems/two-city-scheduling/)                                             | Easy       | [twoCitySchedCost.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/03-twoCityScheduling.java)              |Time: O(nlogn) - Space: O(n)|
| 4   | [Reverse String](https://leetcode.com/problems/reverse-string/)                                                       | Easy       | [reverseString.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/04-reverseString.java)                     |Time: O(n) - Space: O(1)|
| 5   | [Random Pick with Weight](https://leetcode.com/problems/random-pick-with-weight/)                                     | Medium     | [randomPickWithWeight.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/05-randomPickWithWeight.java)       |Time: O(nlogn) - Space: O(n)|
| 6   | [Queue Reconstruction by Height](https://leetcode.com/problems/queue-reconstruction-by-height/)                       | Medium     | [queueReconstructionByHeight.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/06-QueueReconstructionByHeight.java)|Time: O(n^2) - Space: O(n)|
| 7   | [Coin Change 2](https://leetcode.com/problems/coin-change-2/)                                                         | Medium     | [coinChange2.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/07-coinChange2.java)                         |Time: O(n\*input\) - Space: O(n)|
| 8   | [Is Subsequence](https://leetcode.com/problems/is-subsequence/)                                                       | Easy       | [isSubsequence.java](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/08-isSubsequence.java)                     |Time: O(n) - Space: O(m)|
| 9   | [Search insert position](https://leetcode.com/problems/search-insert-position/)                                       | Easy       | [searchInsertPosition](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/09-searchInsertPosition.java)            |Time: O(n) - Space: O(1)|
| 10  | [Sort Colors](https://leetcode.com/problems/sort-colors/)                                                             | Medium     | [sortColors](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/10-sortColors.java)                                |Time: O(n) - Space: O(1)|
| 11  | [Power of Two](https://leetcode.com/problems/power-of-two/)                                                           | Easy       | [powerOfTwo](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/11-powerOfTwo.java)                                |Time: O(log(n)) - Space: O(1)|
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

1. We invert left node and right node first

2. Use **Postorder** traversal (left -> right -> root)

## [deleteNodeInALinkedList](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/02-deleteNodeInALinkedList.java)

1. We are given the node with its position and value

2. Take value from the next node and skip it

## [twoCitySchedCost](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/02-deleteNodeInALinkedList.java)

1. Construct an array with elements being the subtraction between the cost to city B and the cost to city A

2. Negative element tells us that it is cheaper to go to city B.

3. Sort the array to get the cheapest costs to send N people to city B (the other N people go to city A)

4. Add all the costs for 2N people going to city A then substract the cheapest cost

## [reverseString](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/04-reverseString.java)

1. Using two pointers to get the positions of chars that we need to swap

2. Swap s[i] and s[s.length - i -1].

## [randomPickWithWeight](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/05-randomPickWithWeight.java)

1. Generate an array in which each element is the prefix sum of each position in the given array.

2. Generate a random number up to the last prefix sum, then compare with the prefix sum

3. The result is the index of the prefix sum that is right larger than the target

## [queueReconstructionByHeight](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/06-QueueReconstructionByHeight.java)

1. Sort the given array in decreasing order of arr[i][0].

2. If equal, sort in ascending order of arr[i][1].

3. Fill the result array one by one based arr[i][1].

## [coinChange2](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/07-coinChange2.java)

1. Dynamic Programming - Bottom Up

2. Contruct an array with elements from 0 to input 

3. Number of way making up to input equals to number of way making up to smaller numbers

## [isSubsequence](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/07-coinChange2.java)

1. Use a queue to push all the characters of the child input string

2. Loop through the parent input string and looking for the characters in the queue in the parent input string

## [searchInsertPosition](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/09-searchInsertPosition.java)

1. If the last element is smaller than target, then result is array.length()

2. If the first element is greater than target, then result is 0

3. Otherwise, loop through each element to find the right position (Either binary search or linear search)

## [sortColors](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/10-sortColors.java)

1. Use two pointers pointing to head and tail from the input array, then start from here

2. Initiate a variable called current to keep track where we are in the array

3. If 0, swap two numbers at head index and current index. If 1, do nothing. If 2, swap two numbers at tail index and current index

## [powerOfTwo](https://github.com/hieuvanle/codingChallenge/blob/master/leetcodeProblems/11-powerOfTwo.java)

1. Double a number starting at 1 till it reaches input value

2. Check if they are equal




