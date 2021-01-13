# HigherPasswordCheckerTask

Our new school it system is going to require more secure paswords and they wnat you to write the system:)

The passwords mus start with either a (, a ) or * (ASCII codes 40 - 42)
They must end with a capital letter (ASCII codes 65 to 90)\
and they must be at least 8 characters long


this program makes use of charAt() to turn string into characters and casting which lets you to change a variable to another compatable type and length() which tells you how many characters there are in String

**example of uses**

Stirng message = "Computing Rocks";/

char thirdLetter = message.charAt(3); // this would store the value 'p' the character at index 4 of the String

int ASCIIvalue = (int) thirdLetter; //this will store 112 the ASCCII code for the lower case letter p

int length = message.length(); // this will store 15 the number of letters (this starts at 1 so the last index is length()-1)

## Your Task

Write the Java in Main.java to create validate a password with the rules in the task

## The Algorithm Design

**Step 1:** boolean valid set to false\
**Step 2:**	start conditional loop while valild is false\
**Step 3:**	  ask user to enter password\
**Step 4:**	  set character firstLetter to the value of the first letter of password\
**Step 5:**   set character lastLetter to the value of the last letter of password\
**Step 6:**	  integer firstValue to the ascii value of firstLetter\
**Step 7:**   integer lastValue to the ascii value of lastLetter\
**Step 8:**     If firstValue is between 40 and 42 AND lastValue is between 65 and 90 AND password length is greater than 7 THEN\
**Step 9:**       valid = true\
**Step 10:**     ELSE\
**Step 11:**       display "Error password must be at least 8 characters, with a ()* to start adn a captial at the end"\
**Step 12:**     END IF\
**Step 13:** END LOOP\
**Step 14:** display "Your password meets the strength requirements"

Test your program and submitt through a version control commit!

