Feature: Home

A short summary of the feature

@bravo
Scenario: Check Home page
	Given Navigate to the site 
	Then Enter Admin email id 'yourname'
	And Enter Admin password 'yourpassword'
	Then Click on Login button
	When Get logged in then click on 'Home' link
