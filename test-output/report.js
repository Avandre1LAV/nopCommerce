$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/AddCustomer.feature");
formatter.feature({
  "name": "Customers",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a New Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.user_Launch_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL \"http://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.user_open_URL(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enter Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.user_Enter_Email_as_and_Password_as(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.user_click_on_customers_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customer Menu Item",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.click_on_Customer_Menu_Item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add New Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.click_on_Add_New_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Add a new customer / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.page_Title_should_be(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.user_enter_customer_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Save button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.click_Save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.user_can_view_confirmation_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.nopCommerceStep.close_Browser()"
});
formatter.result({
  "status": "passed"
});
});