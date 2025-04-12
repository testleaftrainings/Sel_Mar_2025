3:00 to 3:30 --->Parameterization
3:30 to 4:00 --->Multiple data
4:00 to 4:30 --->Dynamic Parametrization
4:30 to 4:50 --->BreakOut
4:50 to 5:00 --->Break
5:00 to 5:30 --->HooksImplementation & Tags
5:30 to 6:00 --->ExplicitWait,ScreenShot
6:00 to 6:15 --->Recap

static parameterization:
1)surround the data with single quote in the feature file.
2)In the stepdefinition class,replace the data with {string}.
3)pass the i/p args to the mthd and replace the hardcoded data with the args

Steps to pass multiple data to a scenario using Scenario Outline and Examples:
Create a feature file called CreateLead.feature and write all the BDD steps
In Scenario Outline replace the data with <> and pass a name inside it Enter the companyname as
In StepDefinition on the top of that particular method replace the parameterized data with (.)$ @Given("Enter the companyname as (.)$")

Steps to implement Hooks:
Create a package called hooks and create a class called HooksImplementation
Create 2 methods preCondition() and postCondition() and annotate with @Before and @After
The HooksImplementatio class should extends BaseClass
In the Runner class inside glue attribute mention hooks package as well glue ={"steps","hooks"}
Tags:
It is used to categorize the scenarios

tags="@smoke" )// only smoke scenarios will be executed tags="not @smoke") // to exclude a scenario from execution tags="@smoke or @functional")// To run scenarios that have either of the tags tags="@functional and @regression" )//To run scenarios which has both the tags

Exceptions:
1)undefined step exception
2)duplicate step definition exception
3)Invalid method exception
4)Null pointer Exception

Explicit wait:
-Condition based wait,it is used to wait for a certain condn is met or not for the specified time
-After the max.time if the element's behaviour is not met then it will throw Timeout exception