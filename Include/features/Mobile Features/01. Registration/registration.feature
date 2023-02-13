Feature: Registration
  User able to register apps using non registered email. Registered email will get a rejection.
  
  Rule: Only unregistered email is accepted as new user.

  Scenario: Success register using unregistered email
    Given I am starting the application
    When I go to daftar page
    And I click account icon
    And I click masuk button
    And I click daftar button
    When I input user registration data
    And I input Nama Lengkap
    And I input unregistered email
    And I input Password
    And I input Nomor Telepon
    And I input Kota
    And I input Alamat
    When I apply registration
    And I click daftar button
    When I want to verify Title acount page exist
    Then I see Title Account page is there after successfully registering

  Scenario: Failed register using registered email
    Given I am starting the application
    When I go to daftar page
    And I click account icon
    And I click masuk button
    And I click daftar button
    When I input user registration data
    And I input Nama Lengkap
    And I input registered email
    And I input Password
    And I input Nomor Telepon
    And I input Kota
    And I input Alamat
    When I apply registration
    And I click daftar button
    When I want to verify toast failed register message exist
    Then I see toast failed register message is there after using registered email

  Scenario: Failed register using invalid email format
    Given I am starting the application
    When I go to daftar page
    And I click account icon
    And I click masuk button
    And I click daftar button
    When I input user registration data
    And I input Nama Lengkap
    And I input invalid email format
    And I input Password
    And I input Nomor Telepon
    And I input Kota
    And I input Alamat
    When I apply registration
    And I click daftar button
    When I want to verify failed register alert message exist
    Then I see failed register alert message is there after using an invalid email format

  Scenario: Failed register using password less then 6 characters
    Given I am starting the application
    When I go to daftar page
    And I click account icon
    And I click masuk button
    And I click daftar button
    When I input user registration data
    And I input Nama Lengkap
    And I input valid email
    And I input Password of less than 6 characters
    And I input Nomor Telepon
    And I input Kota
    And I input Alamat
    When I apply registration
    And I click daftar button
    When I want to verify failed register alert message exist
    Then I see failed register alert message is there after using an password of less than 6 characters
