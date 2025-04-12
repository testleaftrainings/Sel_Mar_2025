Feature: createlead functionality

#Background:
#Given Launch the Browser and Load the url
@sanity 
Scenario Outline: Createlead with multiple data
When Enter the username as 'demoCSR'
When Enter the password as 'crmsfa'
And Click on Login Button
Then Homepage is displayed
When click on crmsfa link
And click on the leads link
And click on the createlead link
And enter the company name as <company name>
And enter the firstname as <firstname>
And enter the lastname as <lastname>
When click on the leads submit button

Examples:
|company name|firstname|lastname|
|Testleaf|saranya|s|
|Qeagle|Hariprasad|R|

