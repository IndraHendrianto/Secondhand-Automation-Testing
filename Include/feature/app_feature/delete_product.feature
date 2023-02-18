Feature: Delete product
User able to delete product after loggedin to their account.

	Rule: only registered user that have product items
	
Scenario: User delete a product in their account
	Given I am already logged in to my account
	When I go to Daftar Jual Saya page
	And I tap delete icon
	And I tap hapus button
	When I want to verify success delete product
	Then I see pop up notification with text "Produk berhasil dihapus"