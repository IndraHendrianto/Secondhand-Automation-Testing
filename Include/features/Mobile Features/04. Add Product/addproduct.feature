Feature: Add Product
  User want to add new product.
  
  Rule: Users who already have an account, have already logged into the application
  
  Scenario: Positive Add Product
  Given I am starting the aplication
  When I go to add product page
  And I click add product
  When I input new product
  And I input product name "Teh Kotak"
  And I input price Rp 4500
  And I select highest product categorize
  And I input location "Tangerang"
  And I input product description "Teh kotak dalam botol"
  When I input product image
  And I click button add image
  And I select image in phone gallery
  When I tap terbitkan button
  Then I see new product has been added in the apps
  

  Scenario: Negative Add Product more than 5
  Given I am starting the application
  When I input 6 new product
  And I go to Daftar Jual page
  And I check number of products
  When I go to add product page
  And I click add product
  When I input new product
  And I input product name "Teh Kotak"
  And I input price Rp 4500
  And I select highest product categorize
  And I input location "Tangerang"
  And I input product description "Teh kotak dalam botol"
  When I input product image
  And I click button add image
  And I select image in phone gallery
  When I tap terbitkan button
  And I click terbitkan button
  When product less than 5
  And add new product
  When produuct more than 5
  Then verify product more than 5
  
  Scenario: Negative Add Product with wrong price
  Given I am starting the application
  When I go to add product page
  And I click add product
  When I input new product with wrong price
  And I input product name "Teh Celup"
  And I input price Rp 00075687699999
  And I select highest product categorize
  And I input location "Bandung"
  And I input product description "Teh celup isi 50 pcs"
  When I input product image
  And I click button add image
  And I select image in phone gallery
  When I tap terbitkan button
  Then I get custom view with wrong message "Kamu sudah menampilkan lebih dari 5 produk"
  
  
