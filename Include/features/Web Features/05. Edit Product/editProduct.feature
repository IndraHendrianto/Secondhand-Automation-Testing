Feature: Edit Product
  User able to edit product after loggedin to their account.
  
  Rule: only users who have logged in, can edit their products

  Scenario: Users can successfully edit their product data after login
    Given I am already logged in to my account
    When I go to Daftar Jual Saya page
    And I click Daftar Jual Saya button on the header dashboard
    When I want to go to the product detail page
    And I click on one of the products on the Daftar Jual Saya page
    When I want to edit product data
    And I click the Edit button
    When I change the product data
    And I input a different Nama Produk
    And I input a different Harga Produk
    And I select a different Kategori Produk
    And I input a different Deskripsi Produk
    When I want to apply update product data
    And I click the Terbitkan button
    When I want to verify that I successfully update a product data
    And I go to Daftar Jual Saya page
    Then I saw that the updated product data existed