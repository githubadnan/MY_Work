Feature: CheckLogin

Login scenarios with Admin and Clinical User

@alpha
Scenario: Login with the Admin
	Given Navigate to the site 
	Then Enter Admin email id 'yourname'
	And Enter Admin password 'yourpassword'
	Then Click on Login button
