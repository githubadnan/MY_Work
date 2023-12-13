Feature: Product Page

  @tag1
  Scenario: Verify the product filter works accordingly when selecting the filter Name (Z to A)
    Given Navigate to the site
    Then Enter User ID 'standard_user'
    And Enter Password 'secret_sauce'
    Then Click on login button
    When I select the product filter option "Name (Z to A)"
    Then I verify that the products are sorted by Name in descending order

  @tag2
  Scenario: Verify the product get added on cart and Add to cart button changed to Remove button and cart badge
            displays a product counter
    Given Navigate to the site
    Then Enter User ID 'standard_user'
    And Enter Password 'secret_sauce'
    Then Click on login button
    When I click on Product Add to cart button
    Then Add to cart button label must changed to Remove button
    And Cart Icon counter changed to 1

  @tag3
  Scenario: Verify the product get added on checkout page and checkout page's Add to cart button showing Remove button
  and when click on Remove button the product must gets removed and cart badge icon also removed the product counter
    Given Navigate to the site
    Then Enter User ID 'standard_user'
    And Enter Password 'secret_sauce'
    Then Click on login button
    When I click on Product Add to cart button
    And I click on cart icon to open the checkout page
    And I click on the Remove button on the checkout page to remove the product
    And Cart icon remove the product counter

  @tag4
  Scenario: Verify the product is checking out properly
    Given Navigate to the site
    Then Enter User ID 'standard_user'
    And Enter Password 'secret_sauce'
    Then Click on login button
    When I click on Product Add to cart button
    And I click on cart icon to open the checkout page
    Then I click on checkout button
    And I fill the checkout form by giving First Name, Last Name and ZipPostal Code and click on Continue button
    Then I click on Finish button
    And Finish page must open with a message Thank you for your order! and with Back Home button