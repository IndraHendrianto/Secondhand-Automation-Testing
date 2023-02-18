Feature: Sold Product
   Users can accept or reject negotiated products over those that have been offered. 
   
   Rule: Users who already have an account, have already logged into the application

  Scenario: Reject Order
    Given I am starting the aplication
    When I go to interested categorized
    And I click penawaran produk
    And I click diminati
    When I Choose interested product
    And I click "obat kumur"
    When I Reject Product
    And I click tolak
    And I click iya
    When I want to verify product rejected
    Then I see notification "Tawaran produk ditolak"

  Scenario: Cancel Product
    Given I am starting the aplication
    When I go to interested categorized
    And I click penawaran product
    And I click diminati
    When I choose interested product
    And I click "obat kumur"
    When I canceled product
    And I click terima
    And I click status
    And I choose batalkan transaksi
    And I click kirim
    When I want to verify canceled product
    Then I see notification "Status produk berhasil diperbaharui"

  Scenario: Product Has Been Sold
    Given I am starting the aplication
    When I go to interested categorized
    And I click penawaran product
    And I click diminati
    When I choose interested Product
    And I click "obat kumur"
    When I accept sold product
    And I click terima
    And I click status
    And I choose berhasil terjual
    And I click kirim
    When I want to verify canceled product
    Then I see notification "Status produk berhasil diperbaharui"
