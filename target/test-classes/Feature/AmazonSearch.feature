Feature: Amazon search feature

  User-Story: User can search anything from the search box

  @search

  Scenario: Searching in Amazon
    Given user is on the search page
    When user search for shoes
    Then he can find shoes he likes

  Scenario: Searching in Amazon again
    Given user is on the search page iphone
    When user search for iPhone
    Then he can find iphone he likes