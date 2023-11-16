Feature: Invites

A short summary of the feature

@sierra
Scenario: Check Invites page
	Given Navigate to the site 
	Then Enter Admin email id 'yourname'
	And Enter Admin password 'yourpassword'
	Then Click on Login button
	When Get logged in then click on 'Invites' link
