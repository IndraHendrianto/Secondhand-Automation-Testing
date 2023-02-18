Feature: Login
  User able to login apps using registered email. Unregistered email will get a rejection.
  
  Rule: Only registered email is accepted for login.

  Scenario: Success login using registered email
    Given I am starting the website
    When I go to login page
    And I input registered email
    And I input valid password
    When I apply login
    And I click masuk button
    When I want to verify Title Account page exist
    Then I see Title Account page is there after successfully login

  Scenario: Failed login using unregistered email
    Given I am starting the website
    When I go to login page
    And I input unregistered email
    And I input valid password
    When I apply login
    And I click masuk button
    When I want to verify failed login alert message exist
    Then I see failed login alert with 'Email atau kata sandi salah' message is there after failed login

  Scenario: Failed login using empty password
    Given I am starting the website
    When I go to login page
    And I input registered email
    When I apply login
    And I click masuk button
    When I want to verify failed login alert message exist
    Then I see failed login alert with 'Password tidak boleh kosong' message is there after failed login
