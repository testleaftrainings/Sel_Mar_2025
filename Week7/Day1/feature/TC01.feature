Feature: Login functionality of Leaftaps application

#Background:
#Given Launch the Browser and Load the url
@Smoke
Scenario: Login with Positive Credentials


When Enter the username as 'demoCSR'
When Enter the password as 'crmsfa'
And Click on Login Button
Then Homepage is displayed

@Regression
Scenario: Login with Negative Credentials


When Enter the username as 'demo'
When Enter the password as 'crmsfa'
And Click on Login Button
But Error msg is displayed

