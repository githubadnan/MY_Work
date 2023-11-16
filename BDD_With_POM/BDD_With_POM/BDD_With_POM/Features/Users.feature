Feature: Users

Users Page Scenarios including creation of Admin account and Clinical User account 

@golf
Scenario: Check Users page by creating Admin account
	Given Navigate to the site 
	Then Enter Admin email id 'yourname'
	And Enter Admin password 'yourpassword'
	Then Click on Login button
	When Get logged in then click on 'Users' link
	Then I click on the Create User button
	When page opened i click on First Name field and enter First Name 'TestingUser'
	Then I click on last Name field and enter Last Name 'Test'
	Then I click on Email field and enter email 'automation@etc.com'
	Then I click on Role dropdown and select Admin
	Then I click on Password field and enter Password 'yourpassword'
	Then I click on Confirm Password field and enter the same confirm password 'yourpassword'
	Then I click on Domain field and enter domain name '@example.etc'
	And Then i click on Save button


@golfTwo
Scenario: Check Users page by creating Clinical account
	Given Navigate to the site 
	Then Enter Admin email id 'yourname'
	And Enter Admin password 'yourpassword'
	Then Click on Login button
	When Get logged in then click on 'Users' link
	Then I click on the Create User button
	When page opened i click on First Name field and enter First Name 'TestingUser'
	Then I click on last Name field and enter Last Name 'TestingUserTest'
	Then I click on Email field and enter email 'automation@etc.com'
	Then I click on Role dropdown and select User
	Then I click on Password field and enter Password 'yourpassword'
	Then I click on Confirm Password field and enter the same confirm password 'yourpassword'
	Then I click on Domain field and enter domain name '@example.etc'
	And Then i click on Save button