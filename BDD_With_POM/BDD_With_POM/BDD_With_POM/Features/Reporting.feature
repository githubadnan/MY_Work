Feature: Reporting

A short summary of the feature

@foxtrot
Scenario: Check Reporting page
	Given Navigate to the site 
	Then Enter Admin email id 'yourname'
	And Enter Admin password 'yourpassword'
	Then Click on Login button
	When Get logged in then click on 'Reporting' link
