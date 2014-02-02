Feature: Search on Google for PAsjonaci
  As an user
  I want to search on Google
  So that I can see results

  Scenario: results are shown
    Given the page is open "http://www.google.com"
    When I search for "Pasjonaci"
    Then a browser title should contains "Pasjonaci"

    Given the page is open2 "http://www.google.com"