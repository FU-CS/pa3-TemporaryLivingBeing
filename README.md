[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/iS2yxdqG)
# 
# Programming Assignment 3 

**Due: Sep 25, 2024, 11:59 PM**

---
**Instructions**

1. Click on `Accept Assignment` at the link posted on Moodle. This is equivalent to forking the repository.</font>

2. Navigate to the repository you just forked. It should be named `pa3-<your-github-username>`

3. Click on the green `Code` button. Click on SSH tab and copy the SSH link (it is important to use SSH and not HTTPS).

4. Open the terminal on your computer and navigate to the folder where you want to clone the repository.

5. Run `git clone <copied-ssh-link>`. Replace `<copied-ssh-link>` with the link you copied in step 3.

6. In Visual Studio Code, click on File -> Open and open the folder of the repository. 

---

## Question 1. QUEUE 

### 1.A. Implement `Queue` class

Implement the Queue data structure using the primitive Java array. 

This Queue should be able to store Node objects; Node is a class that is already implemented for you in `Node.java` located in `app/src/main/java/pa3/` folder.

Fill in skeleton code in `Queue.java` located in `app/src/main/java/pa3/` folder.

_READ THE COMMENTS IN THE CLASS FILE CAREFULLY FOR DETAILED INSTRUCTIONS AND METHOD SIGNATURES._

The code must compile and run.

You can use the main method in `Queue.java` to do some informal testing. More formal testing will be done in `QueueTest.java`.

###  1.b.  Test `Queue` class

Write test cases for the Queue data structure from Question 1.

Fill in skeleton code in `QueueTest.java` located in `app/src/test/java/pa3/` folder

## Question 2. BINARY TREE

### 1.A. Implement `BinaryTree` class

Implement a binary tree in which elements are stored in the order they are added, from top to bottom levels and left to right within each level.

In other words, the tree should be Balanced at all times: the height of the left and right subtrees of any node differ by at most 1.

Fill in skeleton code in `BinaryTree.java` located in `app/src/main/java/pa3/` folder. 

_READ THE COMMENTS IN THE CLASS FILE CAREFULLY FOR DETAILED INSTRUCTIONS AND METHOD SIGNATURES._

Your code must compile and run.

You can use the main method in `BinaryTree.java` to do some informal testing. More formal testing will be done in the next question.

Please note that the tree should be balanced at all times. This means that when you add a new element, you should add it to the left child of the leftmost node that does not have a left child. If the leftmost node already has a left child, then you should add the new element to the right child of the leftmost node that does not have a right child. If the leftmost node already has a right child, then you should add the new element to the left child of the rightmost node that does not have a left child. And so on.

The BinaryTree class should also be structured based on the order in which elements are added: from top to bottom levels and left to right within each level.

For example, if you add elements 1, 2, 3, 4, 5, 6, 7, in that order, the tree should look like this:

```
    1
   / \
  2   3
 / \ / \
4  5 6  7
```


###  1.b.  Test `BinaryTree` class

Write test cases for the BinaryTree data structure from Question 2.

Fill in skeleton code in `BinaryTreeTest.java` located in `app/src/test/java/pa3/` folder

An example test case is given in the skeleton code. 

Try to cover ALL cases for each method. **Missing a test case scenario, even if your implementation is correct, will result in a deduction of points**.

You must think about all possible edge cases and scenarios when writing test cases. For example, what happens when you try to remove an element that is not in the list? What happens when you try to remove the first element? What happens when you try to remove the last element? What happens when you try to remove the only element in the list?

## Evaluation

Your submission will be evaluated based on the correctness **_and completeness_** of your implementation and test cases. If your implementation is correct but your test cases are incomplete, you will lose points. If your implementation is incorrect, you will lose even more points.