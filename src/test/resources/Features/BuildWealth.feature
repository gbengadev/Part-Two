Feature:  To test the build wealth functionality and verify the header on the "Build Wealth" page

  Scenario: Capture and Print all text in H1 tag on the page

    Given user is on the "Build Wealth" page
    Then the text in the header tag should be printed

  Scenario: Verify and print the wealth value for Tope when he retires at the age of 60

    Given Tope is on the "Build Wealth" page
    When Tope enters his age
    And  Tope enters his salary
    And  Tope enters his investmentPercentage
    And  Tope enters his retirementAge
    And  Tope enters his investmentPreference
    And  Tope clicks the calculateBUtton
    Then the wealth value for Tope should be displayed and printed
