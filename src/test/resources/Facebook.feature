Feature: Creating New Account

Background: universal 
Given user launches the browser "https://www.facebook.com"

Scenario Outline: New Account Sign Up
When user clicks on create new account
When user enters firstname "<firstname>"
And user enters lastname "<lastname>"
And user enters email "<email>"
And user re-enters email "<re-enter>"
And user enters password "<password>"
And user selects dob
And user selects gender
And user clicks sign up
Then quit

Examples:
|firstname|lastname|email|re-enter|password|
|Shiva|Mahadev|shiva@gmail.com|shiva@gmail.com|infinity|
|Satoru|Gojo|gojosatoru@gmail.com|gojosatoru@gmail.com|infinitevoid|
|Gintoki|Sakata|gintoki@gmail.com|gintoki@gmail.com|whiteDevil|
|Kiyotaka|Ayanokoji|kiyotaka@gmail.com|kiyotaka@gmail.com|coldBlood|
