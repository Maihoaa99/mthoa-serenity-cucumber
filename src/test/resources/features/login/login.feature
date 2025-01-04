Feature: Login

  Scenario: Login success
    Given Customer on login page
    When Customer enter "standard_user" and "secret_sauce"
    Then Customer should see home page "Products"

