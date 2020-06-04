Feature: Login


Scenario: Successfull Login With Valid Credentials
Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User Enter Email as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When User click on Logout link
Then Page Title should be "Your store. Login"
And Close Browser

Scenario Outline: Login Data Driven
Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User Enter Email as "<email>" and Password as "<password>"
And Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When User click on Logout link
Then Page Title should be "Your store. Login"
And Close Browser

Examples:
	|  email  |  password  |
	|  admin@yourstore.com | admin  |
	|  admin1@yourstore.com | admin123  |
