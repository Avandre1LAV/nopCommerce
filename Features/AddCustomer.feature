Feature: Customers

Scenario: Add a New Customer
	Given User Launch Chrome Browser
	When User open URL "http://admin-demo.nopcommerce.com/login"
	And User Enter Email as "admin@yourstore.com" and Password as "admin"
	And Click on Login
	Then Page Title should be "Dashboard / nopCommerce administration"
	When User click on customers Menu
	And Click on Customer Menu Item
	And Click on Add New Button
	Then Page Title should be "Add a new customer / nopCommerce administration"
	When User enter customer info
	And Click Save button
	Then User can view confirmation message "The new customer has been added successfully."
	And Close Browser

