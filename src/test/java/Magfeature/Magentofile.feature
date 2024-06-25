Feature: User Signing in site
Scenario: With valid credentials
Given User launch URL and maximize the site
When User click on Sign In
And Enter  valid email id
And Enter valid password
Then Enter on Sign In
When User clicks on women
And User click on jackets
Then click on Juno jacket
And Select the size and color
Then Add to cart
Then Back to home page
And Click on men
Then Click on shorts
And Click pierce gym short
And Select size and color
Then Add to cart
And Click on cart
Then Remove shorts
