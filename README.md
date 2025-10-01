# Und_Redo_Editor-Program
This problem requires building a simple text editor supporting word addition, undo, and redo. Words typed are added, "UNDO" removes the last word, and "REDO" re-adds the last undone word. The final document is printed or "EMPTY" if no words remain after all operations.

Problem Statement-->
Undo-Redo Editor using LinkedList -->
You are building a simple text editor that supports undo and redo operations.
Each time the user types a new word, it is added to the document.
"UNDO" → removes the last word typed (if any).
"REDO" → re-adds the most recently undone word (if any).
At the end of all operations, print the document content as a single line (words separated by space).

If the document is empty after all operations, print:
  EMPTY
  
Input Format:
First line: integer N → number of operations.
Next N lines: each line contains either a word (to be added), "UNDO", or "REDO".

Output Format:
Print the final content of the document as a single line (words separated by space).

Sample Input:
6
hello
world
UNDO
java
REDO
code

Sample Output:
hello java code

1) Sample Input
6
hello
world
UNDO
java
REDO
code

Sample Output
hello java code

2) Sample Input
3
UNDO
UNDO
UNDO

Sample Output
EMPTY

