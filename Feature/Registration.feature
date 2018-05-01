@tag
Feature: Verify Registration Details

@tag1
Scenario: Verify fname and lname fields
Given the user in demoqa website
When the user enters fname and lname
Then the user verifies the entered text in fname and lname

@tag2
Scenario: Verify marital status and hobby
When the user choose marital status and hobby
Then the user verifies the marital status and hobby selected

@tag3
Scenario: Verify the country details
When the user check the country has value
Then the user verifies the country is Afghanistan

