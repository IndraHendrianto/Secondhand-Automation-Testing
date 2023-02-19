Feature: Logout Account
   User able to logout using their registered account.
   
   Rule: Only after successful login to registered account

Scenario: Success logout from registered account
  Given I am starting the app
  When I go to login page
  And I input registered email
  And I input valid password
  When I apply login
  And I tap Masuk button
  When I apply logout
  And I tap Keluar button
  When I want to verify logout is success
  Then I go to account page and see login button exist