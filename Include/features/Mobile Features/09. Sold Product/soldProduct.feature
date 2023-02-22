Feature: Sold Product
   Users can accept or reject negotiated products over those that have been offered. 
   
   Rule: Users who already have an account, have already logged into the application

  Scenario: Product Success Sold
    Given I am starting the application
    When I have logged into seller account
    And I go to add product page
    And I input new product for bid
    And I input product image
    And I input tap Terbitkan button
    When I have logged into buyer account
    And I go to search page
    And I searched for products with the name "Teh Pucuk Harum2"
    And I tap first product on search
    When I want to price bid product
    And I tap Saya Tertarik button
    And I input price of bid
    And I tap Kirim button
    When I have logged into seller account
    And I am on the home page
    When I go to product list page
    And I tap Daftar Jual Saya button
    When I go to interested product page
    And I tap Diminati
    When I go to bid information
    And I tap bid information
    When I want to accept the order buyer
    And I tap Terima button
    When I want to call buyer
    And I tap Hubungi via Whatsapp button
    When I want to check product status
    And I tap Status button
    When I want to change product status
    And I tap Berhasil terjual radio button
    And I tap Simpan button
    When I want to verify product status
    Then I see message "Status Produk Berhasil diperbarui"

    Scenario: Reject Order
    Given I am starting the application
    When I have logged into seller account
    And I go to add product page
    And I input new product for bid
    And I input product image
    And I input tap Terbitkan button
    When I have logged into buyer account
    And I go to search page
    And I searched for products with the name "Teh Pucuk Harum3"
    And I tap first product on search
    When I want to price bid product
    And I tap Saya Tertarik button
    And I input price of bid
    And I tap Kirim button
    When I have logged into seller account
    And I am on the home page
    When I go to product list page
    And I tap Daftar Jual Saya button
    When I go to interested product page
    And I tap Diminati
    When I go to bid information
    And I tap bid information
    When I want to reject the order buyer
    And I tap Tolak button
    When I want to verify product status
    Then I see message "Status Produk Berhasil diperbarui"
    
    Scenario: Cancel Order
    Given I am starting the application
    When I have logged into seller account
    And I go to add product page
    And I input new product for bid
    And I input product image
    And I input tap Terbitkan button
    When I have logged into buyer account
    And I go to search page
    And I searched for products with the name "Teh Pucuk Wangi"
    And I tap first product on search
    When I want to price bid product
    And I tap Saya Tertarik button
    And I input price of bid
    And I tap Kirim button
    When I have logged into seller account
    And I am on the home page
    When I go to product list page
    And I tap Daftar Jual Saya button
    When I go to interested product page
    And I tap Diminati
    When I go to bid information
    And I tap bid information
    When I want to accept the order buyer
    And I tap Terima button
    When I want to call buyer
    And I tap Hubungi via Whatsapp button
    When I want to check product status
    And I tap Status button
    When I want to change product status
    And I tap Batalkan transaksi radio button
    And I tap Simpan button
    When I want to verify product status
    Then I see message "Status Produk Berhasil diperbarui"

    