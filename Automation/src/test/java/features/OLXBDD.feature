Feature: Application Login


Scenario: Home page default login
Given goto olxmall site
When site opened goto mobile and tablets categories
Then select mobiles
And filter the price in range of 40000 to 120000