Feature: Login Functionality

  @tag1
  Scenario: Verify the user gets logged-in with correct credentials
    Given Navigate to the site
    Then Enter User ID 'standard_user'
    And Enter Password 'secret_sauce'
    Then Click on login button
    Then Verify the user gets logged-in to the products page and the Swag Labs and Products headings are displayed

  @tag2
  Scenario: Verify that user gets wrong credentials error when try to login with incorrect credentials
    Given Navigate to the site
    Then Enter User ID 'helloworld'
    And Enter Password 'helloworld'
    Then Click on login button
    Then Verify the user gets incorrect credentials error on login fields

  @tag2
  Scenario: Verify the user gets logged-in with correct credentials and then gets logged-out when click on logout button
    Given Navigate to the site
    Then Enter User ID 'standard_user'
    And Enter Password 'secret_sauce'
    Then Click on login button
    Then Verify the user gets logged-in to the products page and the Swag Labs and Products headings are displayed
    Then Click on Hamburger button
    Then Click on 'Logout' link