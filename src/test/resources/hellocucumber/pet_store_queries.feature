Feature: Retrieving pets list from store

  Scenario: Sort and filter pet types
    Given 'customer' is logged in
    And 'ascending' sort has been selected
    And 'mammal' filter has been selected
    When retrieving list of pets
    Then the response is  received within 200 ms
    And there is the following pet types in this order:
      | Cat |
      | Dog |
