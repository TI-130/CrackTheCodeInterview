## Core data structures, algorithms and concepts 

| Data Structures| Algorithms   | Concepts|
| ------------- |:-------------:| -----:|
| Linked Lists      | BFS | Bit Manipulation |
| Trees, Tries, & Graphs      | DFS     |   Memory (Stack vs.Heap) |
| Stacks & Queues | Binary Search      |   Recurstion |
| Heaps| Merge Sort|Dynamic Programming|
|Vectors/ArrayLists|Quick Sort|Big O Time & Space|
|Hash Tables


## Data Structures
### 1. Vectors/ArrayLists
A collection of elements which are stored in sequence by index.
### 2. Linked Lists
A list that are made up of a series of connecting nodes. Within each node, there exists a pointer to the next node (for double linked list, a node also contains a pointer to the last node). 
### 3. Trees, Tries, & Graphs
#### Tree: a binary data structure with a root node and certain amount of subnodes that make up for its subtree.
#### Trie: an ordered tree data structure used to store a dynamic set or associative array where the keys are usually strings. Unlike a binary search tree, no node in the tree stores the key associated with that node; instead, its position in the tree defines the key with which it is associated. All the descendants of a node have a common prefix of the string associated with that node, and the root is associated with the empty string.
#### Graph: a data structures used to represent graph, which is made up of nodes and edges. 
### 4. Stacks & Queues
Stack: FILO
Queues: FIFO
### 5. Heaps
A specialized tree structure that ensures priority property, which is that if P is parent node of N, the value of P is either greater than or equal to or less than the value of N. 
### 7. Hash Tables
A associative data structure that map keys to values.

## Algorithms
### 1. Binary Search
An efficient search algorithm appiled to sorted array by constantly checking the mid-point value. Runntime: O(logn)
### 2. Merge Sort
A sorting algorithm that applies divide-and-conquer technique. First divining unsorted array to small but equal halves until atom elments are reached, then we regroup and sort the groups of 2 atom elements, then 4 atom elements then 8... until we finally have an array that has the same size as the original one.  
### 3. Quick Sort
A sorting algorithm that recursively do the following two things: find a pivot & partitioning(to order put elements smaller than pivot before the pivot and all elements larger than pivot after it, in which we can fix the index of the pivot).
### 4. BFS
A traverse algorithm that focus on breath.
### 5. DFS 
A traverse algorithm that focus on depth.
## Concepts
### 1. Bit Manipulation 
### 2. Memory (Stack vs.Heap) 
### 3. Recurstion
### 4. Dynamic Programming
### 5. Big O Time & Space
