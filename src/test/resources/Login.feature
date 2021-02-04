#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login 
Feature: Login Test Cases 
	This feature file contains all the test cases related to login scenario

@tag1 
Scenario Outline: Title of your scenario 
	Given user enters valid <url> 
	And valid <username> and <password> 
	When user clicks on login button 
	Then the url of the page should be <expectedurl> 
	Examples: 
		|url                      | username   | password   |   expectedURL|
		| "https://google.com"    | "yourusername" | "yourpassword"| "url1"|
		| "https://google.co.in"  | "username1" | "password1"| "url1"|
		
		@tag2 
		Scenario: Title of your scenario1 
			Given user enters valid url 
			And valid username and password 
			When user clicks on login button 
			Then user should be successfully logged in 
			And title of the login page should be "abcdef" 
			
		@tag3 
		Scenario: Title of your scenario2 
			Given user enters valid url 
			And valid username and password 
			When user clicks on login button 
			Then user should be successfully logged in 
			And title of the login page should be title 
			
			
