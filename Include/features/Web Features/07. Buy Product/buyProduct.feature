Feature: Buy Product
  Users can buy other users' products after login
  
  Rule: only logged in users can buy products

  Scenario: User fails to buy or offer a price on a product they have offered.
    Given I have logged into my account
    When I want to buy or bid again on a product that I have offered
    And I click on one of the products that I have offered on dashboard
    When I want to verify that I can't bid again on that product.
    Then I see the Menunggu respon penjual button existed
