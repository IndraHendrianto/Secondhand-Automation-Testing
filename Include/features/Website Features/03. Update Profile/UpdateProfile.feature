Feature: Update Profile
  User able to update profile anda login using registered email. Unregistered email will rejection.
  
  Rule: Users who already have an account, have already logged into the application

  Scenario: Success Update Profile
    Given I am starting the aplication
    When I go to update profile page
    And I input nama
    And I input kota
    And I input alamat
    And I input No Handphone
    When I apply update data
    And I click submit
    When I want to verify success update data
    Then I see notification "Berhasil Update Data"

  Scenario: Success Update Profile with Wrong Number Phone Format
    Given I am starting the aplication
    When I go to update profile page
    And I input nama
    And I input kota
    And I input alamat
    And I input No Handphone but using wrong format
    When I apply update data
    And I click submit
    When I want to verify success update data
    Then I see notification "Berhasil Update Data"

  Scenario: Success Update Profile with Empty Fill Form
    Given I am starting the aplication
    When I go to update profile page
    And I clear nama form
    And I clear kota form
    And I clear alamat form
    And I clear No Handphone form
    When I apply update data
    And I click submit
    When I want to verify success update data
    Then I see notification "Berhasil Update Data"
