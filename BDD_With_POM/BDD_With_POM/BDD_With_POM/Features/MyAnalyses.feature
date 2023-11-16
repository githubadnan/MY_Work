Feature: MyAnalyses

Scenarios of User page including creation of Admin and Clinical User

@tango
Scenario: Check MyAnalyses page
	Given Navigate to the site 
	Then Enter Admin email id 'yourname'
	And Enter Admin password 'yourpassword'
	Then Click on Login button
	When Get logged in then click on 'My Analyses' link
