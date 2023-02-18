Feature: Update Profile
  User able to update profile page after login using registered email.
  
  Rule: Only registered email is accepted for login and update profile page

  Scenario: Success login and update profile
    Given I am starting the website
    When I go to login page
    And I input registered email
    And I input valid password
    When I apply login
    And I click Masuk button
    And I input Nama Lengkap
    And I input Kota
    And I input Alamat
    And I input Nomor Telepon
    When I apply update profile
    And I click submit button
    When I want to verify update message exist
    Then I see Berhasil update profile message is there after successfully update profile

  Scenario: Unsuccessfully update Phone Number using wrong format
    Given I am starting the website
    When I go to login page
    And I input registered email
    And I input valid password
    When I apply login
    And I click Masuk button
    And I input Nama Lengkap
    And I input Kota
    And I input Alamat
    And I input Nomor Telepon
    When I apply update profile
    And I click submit button
    When I want to verify update message exist
    Then I see nothing is there after unsuccessfully update profile