# Assignment 1 Part 1 Report

## MathFunctions.sum
- What do you think the actual bug or bugs are?   
I think the actual bug is that b is subtracted from a, not added.

- How many test cases do you think are needed? Why?   
I think you would only need one test case to find the bug, and that is to test two positive integers. However, it is good to cover more of the input domain. To test the "extremes", you would also need one test case to test one or two zero integers, and one to test negative integers.

- Did you find any unexpected behaviors?   
Yes, the function subtracted b from a instead of adding it to a.

## MathFunctions.sumNumbers
- What do you think the actual bug or bugs are?   
I think the actual bug is that the function looks at the odd indexes in the array and adds the values at those indexes, instead of looking at the odd values independent of their poition in the array.

- How many test cases do you think are needed? Why?   
I think you need one test case for positive integers and one for negative integers to see that the addition works, and one test case for values that are randomly distributed in the array to see that the function works with the actual values, not the indexes. I aldo added a testcase to see that the function returned 0 for an empty array, as that is what I suspected since the documentation didn't mention any exceptions.

- Did you find any unexpected behaviors?   
Yes, I found that the function adds the values at the odd indexes in the array instead of adding the odd values independent of index, as is staded in the documentation. There was no expected behaviour for inputting an empty array, but it turned out to result in the function returning 0.

## Name class
- What do you think the actual bug or bugs are?   
- How many test cases do you think are needed? Why?   
- Did you find any unexpected behaviors?   
- What are your reccomendations to the developers of `test_lib`?   

## StringFunctions.printHelloWorld
- Describe specifically how the mocking was done

## Menu class
- Describe specifically how the mocking was done
- Describe specifically how you tested that the menu was reprinted - after invalid input
- What are your reccomendations to the developers of `test_lib` specifically focusing on facilitating testing and making less fragile unit tests.
