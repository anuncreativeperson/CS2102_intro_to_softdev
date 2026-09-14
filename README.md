# Gas, Electric or Hybrid! 
## Calculate the MPG, MPGe or AvgMPG you used in a trip!

This project for CS2102 Intro to Software Engineering has the user input the number of miles and gallons(or kWh equivalent) to calcuate the MPG, MPGe or AVGMPG depending on the modes used during driving. Moreso it served for...

*Practice in java syntax
*Practice using java interfaces
*Practice using Junit for a number of Unit tests and Edge cases
*Practice in putting project in a zip file
*Practice in creating a README

## How to use this program
My best guess, you'll download the zip file off github and open it up. From there open your IDE of choice and plug in the folder. 

Using the program is way simpler:
*javac -cp .:lib/* c/*.java u/*.java
This will compile the project, make sure you're in the directory containing c, u, and lib. 
*java -cp .:lib/*:c:u org.junit.runner.JUnitCore calcgasMPGTest 
*java -cp .:lib/*:c:u org.junit.runner.JUnitCore calcMPGeTest
These will activate the unit tests/edge cases. They should all properly work.
If you don't want to use terminal, then there should be green circled checkmarks near @Test. Just enter the U folder, click on one of the Test files and they will appear. 

To run the program, click on your IDE run feature or use a shortcut. Ctrl + F5 is running without debugging and F5 is running with debugging(these are the vscode shortcuts)

Once the program runs, you can input your miles and gallons and the program will do the rest. 

## Known issues
There are a ton of issues in this:
*No edge cases for dividing by zeros
*The program will wait until all inputs are recieved before giving you an error
*Only one error will show up even if multiple errors were made
    EX. Say I input two negatives, the program will only tell me about the first negative input and won't mention the second negative number. 
*As the code is right now, inputing a zero for a denominator does not return an error stating 'no zeros allowed as denominators' instead it returns zero so the rest of the program can run. 
*The code uses a lot of if statements, in the future I hope to mitigate this

## Current Fixes Planned 
Create different classes for Gas, Electric and Hybrid Vehicles. This way we can seperate the mathematics and not have the hybrid class run the math. I believe this will mitigate some of the issues and allow for better code readablitiy. 

