#Author:
#Keywords Summary :
Feature: API Testing sample feature file test British National Bibliography

  @checkBibliography
  Scenario Outline: Obtain bibliography data
    Given I call API endpoint "<resource>"
    Then I can see "<response>"
    And the current "<format>"
    And available "<label>"

    Examples: 
      | resource        | response | format          | label                      |
      | /007446989.json |      200 | linked-data-api | On parade / Leonard Sanitt |
      | /007446989.json |      200 | linked-data-api | On parade / Leonard Sanitt |
