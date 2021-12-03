Feature: Feature to test the sub menu list

Scenario: Assert that the "Build Wealth" is included in the submenu list

Given user is on home page
When user clicks on "Products" menu
Then "Build Wealth" is included in the submenu

