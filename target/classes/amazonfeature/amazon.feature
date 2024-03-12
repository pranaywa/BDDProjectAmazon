Feature: Amazon Functionalities
Scenario: verify cart icon on home page
Given User is at home page
Then User should able to see the cart icon

Scenario: Verify search functionaty
Given User is at homepage
When  User click on search field 
And   User type mobile in search field 
And   User click on search icon
Then  User is on mobile page 
When  User click on one of the mobile 
Then  User is on redmi mobile page 

Scenario: Verify the signIn functionality
Given User is at homepage
When User hover on the helloSignIn button
Then User should able to see the signIn button on popup
When User click on the signIn button 
Then User navigate to the signIn page 
 



 
