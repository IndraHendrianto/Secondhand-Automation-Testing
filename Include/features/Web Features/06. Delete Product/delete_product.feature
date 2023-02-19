Feature: Delete product
User able to delete product after loggedin to their account.

	Rule: only registered user that have product items
	
Scenario: User delete a product in their account
	Given I am already logged in to my account
	When I go to Daftar Jual Saya page
	And I click on product I want to delete
	And I click on hapus button
	And I go to Daftar Jual Saya page
	When I want to verify success delete product
	Then I see that the product is not existed