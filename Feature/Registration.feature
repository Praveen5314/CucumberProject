@tag
Feature: Verify Registration Details

Background: 
 Given the user in Demoqa Website

@tag1
Scenario: Verify FirstName and LastName fields

When the user enters FirstName and LastName
Then the user verifies the entered text in FirstName and LastName

@tag2
Scenario: Verify Marital Status and Hobby
When the user choose Marital Status and Hobby
Then the user verifies the selected Marital Status and Hobby 

@tag3
Scenario: Verify the Country Details
When the user check the Country has value
Then the user verifies the Country is Afghanistan

