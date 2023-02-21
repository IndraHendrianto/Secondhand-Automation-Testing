Feature: Add Product
  User able to add product after loggedin to their account.
  
  Rule: only users who have logged in, can add products

  Scenario: User successfully adds product after login
    Given I am already logged in to my account
    When I go to add product page
    And I click Jual button on dashboard
    When I input product data
    And I input Nama Produk
    And I input Harga Produk
    And I select Kategori Produk
    And I input Deskripsi Produk
    When I apply Add Product
    And I click the Terbitkan button
    When I want to verify that I successfully added a new product
    And I go to Daftar Jual Saya page
    Then I saw that the new product existed

  Scenario: User failed to add product because they are not logged in
    Given I haven't logged in
    When I go to add product page
    And I click Jual button on dashboard
    When I fail to add a product because I have not logged in, I am thrown to the login page
    Then I saw the login page
