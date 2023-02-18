Feature: Buy Product
  Users can make an offer on the product that has been selected.
  
  Rule: Users who already have an account, have already logged into the application
  
  Scenario: Negative Buy Product
  Given I am starting the aplication
  When I go to search page
  And I click search bar
  When I search product
  And I type "boneka pokemon"
  And I click the product
  When I want to negotiation price
  And I click saya tertarik dan ingin nego
  And I input the price with Rp 0
  And I click kirim
  When I want to verify success to buy product
  Then I see notification harga tawarmu sudah dikirim ke penjual
  
  Scenario: Positive Buy Product
  Given I am starting the aplication
  When I go to search page
  And I click search bar
  When I search product
  And I type "baju muslim"
  And I clict the product
  When I want to negotiation price
  And I click saya tertarik dan ingin nego
  And I input the price with upscale the product price Rp 60000
  And I click kirim
  When I want to verify success to buy product
  Then I see notification harga tawarmu sudah dikirim ke penjual