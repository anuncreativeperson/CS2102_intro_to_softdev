This labs objective was:
"To learn how to use java interfaces, github and junit4"

From my understanding of the lab we were only allowed to use 4 classes that being the two interfaces(Gas and Electric), a main class called CarRunner and the Hybrid class. 

The two interfaces are exactly the same as the lab, CarRunner uses java Scanner to read inputs from the terminal. Ideally, I would have liked to create seperate classes for Gas and Electric, so that the user could pick between the different "modes". I felt like this would have made the terminal ui less complicated and seperating the math would have been really useful as the code wouldnt have relyed heavily on what came before it or was happening sequentially. 

Regardless, the program works by reading Miles used in Gas, gallons used, kWh used, and Miles used in Electric. If every input has a positive number, then the AvgMPG will be calculated and you'll get a message stating you used the Hybrid mode. Had either Gas's MPG or ELectric MPGe (calculated by using totalkWh/33.7 the kWh equivalant of one gallon) been zero, then you wouldve recieved a gas or electric mode message along with whichever MPG/e wasn't zero. 

There are a total of 4 unit cases and 2 edge cases. The edge cases test for negative numbers and use assertions to provide throw a IllegalArugmentException. Setting up unit cases was a mess and I had to ask co-pilot for help. My prompt was "This is what my code space currently looks, how would I set up my space to be able to create a unittest". This is where the lib folder comes, it did not help me write any of the unit tests or edge cases. Only to set up the environment. I owe it all to these resources online, which provided examples of simple structures to follow.

Java if statement - GeeksforGeeks 
Java Interface - GeeksforGeeks 
Java User Input - Scanner Class - GeeksforGeeks 
Java Program to Print a New Line in String - GeeksforGeeks 
Difference between Inheritance and Interface in Java - GeeksforGeeks 
Abstraction in Java - GeeksforGeeks 

Interfaces vs Abstract Classes / Inheritance | Programming concept overview -ForlornU
Learn INTERFACES in 6 minutes! 📋 - YouTube - Brocode
Java Unit Testing with JUnit - Tutorial - How to Create And Use Unit Tests - YouTube 

Assert (JUnit API) 
java - Meaning of delta or epsilon argument of assertEquals for double values - Stack Overflow 

How To Write a USEFUL README On Github - Youtube - Learn Fast Make Things

Overall, this lab was really difficult, and I'm glad to have picked this class because this is exactly what I wanted out of it. The challenge of creating projects that actually simulates a real software engineer environment. I cannot wait to see how much I grow over this semseter. Hopefully, this will be the only lab I turn in late. 