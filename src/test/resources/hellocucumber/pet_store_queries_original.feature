Feature: Pet store queries

  Scenario: Get mammals
    Given I am logged in
    When I send a 'GET' request to '{base}/pets'
    And I add the query string parameters:
      | sort | desc |
      | filter | mammal |
    Then I should receive a response with the status 200
    And I should receive a response within 1000ms
    And the response body json path at "$.[0].type" should equal "Cat"
    And the response body json path at "$.[1].type" should equal "Dog"
