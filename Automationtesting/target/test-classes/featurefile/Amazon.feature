  Feature: Validation of Amazon application

    @TestAmazon
    Scenario: To validate the login funcionality and add to cart functionality.
      Given User logs in to amazon application and search for product
      When User selects the product and add to cart
      Then The product added to the cart

