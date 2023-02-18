Feature: Logout Account
   User able to logout using their registered account.
   
   Rule: Only after successful login to registered account

Scenario: Success logout from registered account
  Given I am starting the website
  When I go to login page
  And I input registered email
  And I input valid password
  When I apply login
  And I click Masuk button
  And I click on profile button
  When I apply logout
  And I click on logout button
  When I want to verify homepage login button exist
  Then I see homepage login button exist