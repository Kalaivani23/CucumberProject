@tag
Feature: User book the hotel in adactin page

  Background: User verify the url and title
    Given User verify the url and title


  @tag1
  Scenario Outline: User book the hotel by more values
 
    Given User login the adactin page "<username>" and "<password>"
    And User enter the details in search hotel page "<location>","<hotel>","<roomtype>","<numrooms>","<chechin>","<checkout>","<adtcount>" and "<chdcount>"
    When User enter the details in booking hotel page "<firstname>","<lastname>","<address>","<cardno>","<cardtype>","<expmonth>","<expyear>" and "<ccv>"

    Examples: 
      | username   | password | location | hotel       | roomtype | numrooms  | chechin    | checkout   | adtcount | chdcount | firstname | lastname | address | cardno           | cardtype | expmonth | expyear | ccv |
      | sivagreens | 1I9AK2   | London   | Hotel Creek | Double   | 3 - Three | 28/05/2019 | 29/05/2019 | 2 - Two  | 1 - One  | kalaivani | velusamy | 42/17   | 1236547896321456 | VISA     | February |    2022 | 258 |
