# OneAway
Exercise related with Arrays and Strings.

## Exercise Challenge
There are three types of edits that can be performed on strings: insert a character, remove a character or replace a character. Given two strings, write a function to check if they are one edit (or zero) away one from the other.

### Solution
I begin with checking that the length of the strings only vary by one. 
Then I do different things depending on what kind of edit it is. 
If it is a replacement, I iterate through both the strings at the same time and then I check if every character is the same. If there are not the same, I increment the edits counter by one, and if this counter passes 1, I reject. 
If it is an insertion, I iterate both strings and if one character does not match, I increment by one the counter of edits, and I increment an offset that will be added to the iteration of the longer string, so I stay at the right place. (I also decrement de i, so I don't miss any character). 
If it is a remove, I do the same thing but with the other string as the long one. 
This algorithm runs in O(N) runtime where N is the length of the shorter string.