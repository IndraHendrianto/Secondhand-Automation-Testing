Feature: Edit Product
  User want to edit exiting product
  
  Rule: Users who already add a product, have already logged into the application
  
  Scenario: Succes Edit Product
  Given I am starting the aplication
  When I go to my sell list page
  And I click my sell list
  When I go to detail product page
  And I click the product
  When I change product data
  And I change product name data
  And I change product price data
  And I change city name data
  And I change product description data
  When I tap update product button
  Then I see update product alert with 'Produk berhasil diperbarui'
  