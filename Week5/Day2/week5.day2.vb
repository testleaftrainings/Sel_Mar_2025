3:00 to 4:00 --->TestNg Basics &Seq.Execution
4:00 to 4:20 --->BreakOut
4:20 to 5:00 --->ParallelExecution
5:00 to 5:10 --->Break
5:10 to 5:30 --->BreakOut
5:30 to 6:00 --->TestNG Annotations

softwares required for TestNg:
1)TestNg plugins
2)dependencies

How to convert to TestNg script:
1)convert main mtd to normal mtd.
  a)remove static keyword
  b)remove string args
  c)give a valid mthd name

  Seq Execution:
1)select the testcase--->rightclick-->TestNg-->conver to testNg-->file name-->click on finish.
2)next to pom.xml-->you can see the file as name.xml
3)execute testcases from the xml file.
4)verbose-->to get the error logs  of your testcases.

2)Add @Test and impot It
note:class name and mthd name shoud be different

Parallel execution:
Select the required testcases and create a testng_parallel.xml
Open the xml file and add the attribute parallel ="classes"in the to run classes in parallel
Use the attribute thread-count to control the number of instances to be opened in parallel
To run mutiple tests in parallel add parallel="tests" in
Finally run the xml fi

To view the reports:
1)refresh your project
2)test-output--->index.html(rightclick)---->openwith-->systemeditor

TestNg Annotations:

@BeforeSuite---->begining of the project

 @Beforetest---->set the testlevel info

  @BeforeClass--->set testcase details

   @BeforeMethod---->precondns

    @Test

    @AfterMethod---->postcondns

  @afterclass

 @AfterTest

@AfterSuite