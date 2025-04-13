3:00 to 3:30 --->ExceptionHandling
3:30 to 4:00 --->Constructor
4:00 to 4:10 --->Break
4:10 to 5:00 --->POM Introduction
5:00 to 5:20 --->Breakout
5:20 to 5:30 --->Break
5:30 to 6:00 --->Seq & Parallel Execution
6:00 to 6:15 --->Recap

Exception:
-Abnormal behaviour which stops the execution of the program.
Types:
1)Compiletime(checked)-external factors(i/o errors)
2)runtime(unchecked)-during the execution of pgm.
How to handle exceptions:
 using try/catch block

 1)use singe try with multiple catch blocks
 2)multiple try and catch blocks
 3)we cannot use try and catch blocks separately

 Leaftaps:
 -Loginpage
   enter usname
   enter password
   click on Loginpage
 -WelcomePage
  click on crmsfa link
 -My home page
  click on leads
 -My leads page
  click on createlead
 -CreateLead
  cname
  fname
  lname
  click on createlead
 -viewleads

 Steps to Implement POM:
Create a new Project and have all the dependencies inside the pom.xml
Create 3 packages inside src/main/java
base Create a ProjectSpecificMethods and create 2 methods preCondition() and postCondition() and annotate with @BeforeMethod and @AfterMethod Create static driver as a global variable
pages Create 6 classes for each page Each Classes inside pages package should extends ProjectSpecificMethods Create methods for each action inside each page Inside each method add return statement according to the page navigation if an action stays in the sama page -> return this if an action takes you to another page -> return new Page();
testcases
All classes inside the testcase package should extend ProjectSpecificMethods Create a class called RunLogin Create a method called runLogin and annotate with @Test Create object for LoginPage and call the method and execute
For Sequential Execution:
- Driver declaration should be static
- Create 2 testcases inside testcases package
     runLogin
     runCreateLead
- Select the required testcases and convert into testng.xml file
- Finally, run the testcases together sequentially from testng.xml file
For Parallel Execution:
    - Remove static keyword in PSM
    - Create parameterized constructor in each pages
       public LoginPage(ChromeDriver driver) {
	        this.driver=driver;
         }
    - Pass driver value in each Constructor initialization in each pages and testcases
