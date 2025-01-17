Feature: Login

Scenario: Successful Login with valid Credentials
Given User Launch Chrome Browser
When User opens url "http://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When user clicks on Logout link
And Close browser



Scenario Outline: Login Data Driven

Given User Launch Chrome Browser
When User opens url "http://admin-demo.nopcommerce.com/login"
And User enters Email as "<email>" and Password as "<password>"
And Click on Login
Then Page Title should be "Dashboard / nopCommerce administration"
When user clicks on Logout link
And Close browser

Examples:

|email | password|
|admin@yourstore.com|admin|
|admin1@yourstore.com|admin1|



