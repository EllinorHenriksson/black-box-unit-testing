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
I think the actual bug is that the constuctor throws an IllegalArgumentException for a name consisting of 3 letters. In the specification, it says that the name must be at least 3 characters long.

- How many test cases do you think are needed? Why?   
One test case is needed to find the bug, namely to test with a name that is exactly 3 letters long. Since the documetation wasn't very clear about wich characters are not allowed in a name, it is also a good idea to test the most common characters in a name, such as space between first and last name, and hyphen in a double name.

- Did you find any unexpected behaviors?   
Yes, I expected the constructor to not throw an exception when I inputted a 3 letter long name, according to the specification, but it throwed an IllegalArgumentException. Also, I tried to input a first and a last name with a space between, but it resulted in an IllegalArgumentException being throwed. From the documentation I could not conclude if this would happen, but I assumed it would. However, the term "name" is commonly used for first name and last name together, so it would be beneficial to make it clear if that is intended or not. Testing double names with a hyphen between also resulted in an IllegalArgumentException being throwed, even though they are quite common, at least here in Scandinavia.   
Lastly, I tested to input non-english letters such as åäö, but that throwed an IllegalArgumentException, wich was unexpected.

- What are your reccomendations to the developers of `test_lib`?   
My recommendation is to either fix the bug so that the user can input a 3 character long name, or to update the documentation so it informs the user that the name must be over 3 characters long. Also, the developers should consider if they should allow for first and last names with a space between and/or double names with a hyphen in them, and to make it explicitly clear in the documentation if it is allowed or not. It would also be a good idea to specify what alphabeth can be used, and to cosider to allow for non-english letters such as å, ä and ö.

## StringFunctions.printHelloWorld
- Describe specifically how the mocking was done  
The mocking was done manually by ceating a mock class for PrintStream, i.e. a subclass that extends PrintStream. The method println(String x) was overridden by the mock class and implemented by assigning the input to a public attribute called 'printedMessage' in the mock class. The test then asserted if the expected value "Hello World!" was equal to the actual value, i.e. the value of the attribute 'printedMessage', after the method printHelloWorld(PrintStream out) had been called with the mock object. I could thereby assess if the println method had been called with the expected string.

## Menu class
- Describe specifically how the mocking was done   
The mocking was done one the PrintStream class with a subclass that overwrites the println(String x) method, and by passing a string of the test input to the Scanner constructor.

- Describe specifically how you tested that the menu was reprinted - after invalid input   
I tested that the menu was reprinted by overwriting the println method in the PrintStream mock class, where I implemented a counter for when the input contains the exact string "Main Menu". The result of the counter is stored in the public attribute 'numberOfPrints" in the PrintStream mock class. After excersising the system under test (i.e. doMenu()) with an invalid input followed by a valid input, I asserted if the expected value 2 was the same as the actual value (i.e. 'numberOfPrints').

- What are your reccomendations to the developers of `test_lib` specifically focusing on facilitating testing and making less fragile unit tests.   
I think it would be easier to test doMenu() if it returned an Action for invalid input, and didn't loop through printing of the menu inside the function until the input is correct, but rather outside the method (i.e. calling it until it returnes a valid Action).
Then you could test how many times the method is called instead of testing how many times the menu is printed. Also, the way I had to test the number of menu prints isn't optimal as I use the string "Main Menu", wich I got from looking at the printed text in the console. If someone wants to change the printed text the test might break.   
As for now, I had to do explorative testing and run the application to figure out what input was allowed to the program (i.e. 1 and 0). It would be better if it was clearly stated in the specification or in a use case etc.
