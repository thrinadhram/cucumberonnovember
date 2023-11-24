Feature: login
Scenarios: login

Scenario: Successful login with valid Data
Given user launch chrome browser
When User Opens url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And User Enter Email as "admin@yourstore.com" and password as "admin"
And click on login
When User click on LogOut link
And close browser

Scenario Outline:login Data Diven

Given user launch chrome browser
When User Opens url "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And User Enter Email as "<email>" and password as "<password>"
And click on login
When User click on LogOut link
And close browser

Examples:
|email|password|
|admin@yourstore.com|admin|
|admin@yourstore.com|admin123|