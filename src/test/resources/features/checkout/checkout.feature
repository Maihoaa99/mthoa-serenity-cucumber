Feature: Checkout
  Background:
    Given Customer on login page
    When Customer enter "standard_user" and "secret_sauce"
    And Customer add product to cart
    And Customer click to cart
    And Customer click checkout

  Scenario: Checkout success
    And Customer enter firstname "Mai"
    And Customer enter lastname "Hoa"
    And Customer enter zipcode "123"
    And Customer click btn continue
    And Customer check product information
    Then Customer see page thank you

  Scenario: Checkout do not enter firstname
    And Customer enter lastname "Hoa"
    And Customer enter zipcode "123"
    And Customer click btn continue
    Then Customer see error notification

  Scenario: Checkout do not enter lastname
    And Customer enter firstname "Mai"
    And Customer enter zipcode "123"
    And Customer click btn continue
    Then Customer see error notification

  Scenario: Checkout do not enter zipcode
    And Customer enter firstname "Mai"
    And Customer enter lastname "Hoa"
    And Customer click btn continue
    Then Customer see error notification