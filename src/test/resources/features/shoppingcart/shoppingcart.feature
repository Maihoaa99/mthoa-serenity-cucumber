Feature: Shopping cart
  Background:
    Given Customer on login page
    When Customer enter "standard_user" and "secret_sauce"

  Scenario: Add product to cart
    And Customer add product to cart
    And Customer click to cart
    And Customer check mount product
    And Customer check name added product
    And Customer check price added product
    Then Customer see added product

  Scenario: Remove product to cart
    And Customer remove product to cart
    And Customer check mount remain product
    Then Customer see remain product