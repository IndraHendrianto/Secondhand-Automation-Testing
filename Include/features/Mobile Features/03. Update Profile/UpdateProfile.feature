Feature: Update Profile
    
  Rule: Only registered email is accepted for login.

  Scenario: Success Update Profile
    Given I am starting the application
    When I go to profile page
    And I click profile
    When I want to change nama
    And I click nama form
    And I change nama
    When I want save
    And I click simpan button
    When I want to verify success update exist
    And I see notification profil berhasil diperbaharui
    When I want to change phone number
    And I click phone number form
    And I change phone number
    When I want save
    And I click simpan button
    When I want to verify success update exist
    And I see notification profil berhasil diperbaharui
    When I want to change city
    And I click city form
    And I change city
    When I want save
    And I click simpan button
    When I want to verify success update exist
    And I see notification profil berhasil diperbaharui
    When I want to change address
    And I click address form
    And I change address
    When I want save
    And I click simpan button
    When I want to verify success update exist
    Then I see notification profil berhasil diperbaharui

  Scenario: Failed Update Profile
    Given I am starting the application
    When I go to profile page
    And I click profile
    When I want to delete nama
    And I click nama form
    And I delete nama
    When I want save
    And I click simpan button
    When I want to verify alert massage exist
    And I see notification wajib diisi
    And I click outside the bottom sheet
    When I want to delete phone number
    And I click phone number form
    And I delete phone number
    When I want save
    And I click simpan button
    When I want to verify alert massage exist
    And I see notification wajib diisi
    And I click outside the bottom sheet
    When I want to delete city
    And I click city form
    And I delete city
    When I want save
    And I click simpan button
    When I want to verify alert massage exist
    And I see notification wajib diisi
    And I click outside the bottom sheet
    When I want to delete address
    And I click address form
    And I delete address
    When I want save
    And I click simpan button
    When I want to verify alert massage exist
    And I see notification wajib diisi
    Then I click outside the bottom sheet
