3:00 to 3:30 --->POM with Cucumber
3:30 to 3:50 --->Breakout
3:50 to 4:50 --->Pom-ThreadLocal
4:50 to 5:00 --->Break
5:00 to 5:30 --->Pom-ExcelIntegration
5:30 to 6:00 --->ExtentReports

POM with Cucumber:
For TestNG _POM : - with driver as static -> sequential execution is possible - To have sequential and parallel execution declare Parameterized Constructor in each pages
For Cucumber_POM: - Constructor should not be defined - With driver as static -> sequential execution is possible

private-accessed only with in the class
static-belong to class and not to any instance and it ensures on copy for each of the class.
final-once the ocject is initialized,it cannot change it.

Java class which is used to access each thread independently private static final ThreadLocal chDriver = new ThreadLocal();
private: - This variable can be accessed only within the class static+final - constant -> cannot change the value
public void setDriver() {
    //Sets the current thread's copy of this thread-local variable
	chDriver.set(new ChromeDriver());
}

public ChromeDriver getDriver() {
    //Returns the value in the current thread's copy of this thread-local variable
	return chDriver.get();
}

extentReports:
1.adding the library(Avenstack)
2.ExtentHtmlReporter
  ExtentReports
  ExtentTest
  

