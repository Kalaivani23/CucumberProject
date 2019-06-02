$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/feature/AdactinFeature.feature");
formatter.feature({
  "line": 2,
  "name": "User book the hotel in adactin page",
  "description": "",
  "id": "user-book-the-hotel-in-adactin-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "User book the hotel by more values",
  "description": "",
  "id": "user-book-the-hotel-in-adactin-page;user-book-the-hotel-by-more-values",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User login the adactin page \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enter the details in search hotel page \"\u003clocation\u003e\",\"\u003chotel\u003e\",\"\u003croomtype\u003e\",\"\u003cnumrooms\u003e\",\"\u003cchechin\u003e\",\"\u003ccheckout\u003e\",\"\u003cadtcount\u003e\" and \"\u003cchdcount\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the details in booking hotel page \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003caddress\u003e\",\"\u003ccardno\u003e\",\"\u003ccardtype\u003e\",\"\u003cexpmonth\u003e\",\"\u003cexpyear\u003e\" and \"\u003cccv\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "user-book-the-hotel-in-adactin-page;user-book-the-hotel-by-more-values;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotel",
        "roomtype",
        "numrooms",
        "chechin",
        "checkout",
        "adtcount",
        "chdcount",
        "firstname",
        "lastname",
        "address",
        "cardno",
        "cardtype",
        "expmonth",
        "expyear",
        "ccv"
      ],
      "line": 16,
      "id": "user-book-the-hotel-in-adactin-page;user-book-the-hotel-by-more-values;;1"
    },
    {
      "cells": [
        "sivagreens",
        "1I9AK2",
        "London",
        "Hotel Creek",
        "Double",
        "3 - Three",
        "28/05/2019",
        "29/05/2019",
        "2 - Two",
        "1 - One",
        "kalaivani",
        "velusamy",
        "42/17",
        "1236547896321456",
        "VISA",
        "February",
        "2022",
        "258"
      ],
      "line": 17,
      "id": "user-book-the-hotel-in-adactin-page;user-book-the-hotel-by-more-values;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9337148299,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User verify the url and title",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User verify the url and title",
  "keyword": "Given "
});
formatter.match({
  "location": "AdactinStep.user_verify_the_url_and_title()"
});
formatter.result({
  "duration": 297701292,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User book the hotel by more values",
  "description": "",
  "id": "user-book-the-hotel-in-adactin-page;user-book-the-hotel-by-more-values;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 8,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User login the adactin page \"sivagreens\" and \"1I9AK2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enter the details in search hotel page \"London\",\"Hotel Creek\",\"Double\",\"3 - Three\",\"28/05/2019\",\"29/05/2019\",\"2 - Two\" and \"1 - One\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8,
    9
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter the details in booking hotel page \"kalaivani\",\"velusamy\",\"42/17\",\"1236547896321456\",\"VISA\",\"February\",\"2022\" and \"258\"",
  "matchedColumns": [
    16,
    17,
    10,
    11,
    12,
    13,
    14,
    15
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "sivagreens",
      "offset": 29
    },
    {
      "val": "1I9AK2",
      "offset": 46
    }
  ],
  "location": "AdactinStep.user_login_the_adactin_page_and(String,String)"
});
formatter.result({
  "duration": 9178290194,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 45
    },
    {
      "val": "Hotel Creek",
      "offset": 54
    },
    {
      "val": "Double",
      "offset": 68
    },
    {
      "val": "3 - Three",
      "offset": 77
    },
    {
      "val": "28/05/2019",
      "offset": 89
    },
    {
      "val": "29/05/2019",
      "offset": 102
    },
    {
      "val": "2 - Two",
      "offset": 115
    },
    {
      "val": "1 - One",
      "offset": 129
    }
  ],
  "location": "AdactinStep.user_enter_the_details_in_search_hotel_page_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 5914795166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kalaivani",
      "offset": 46
    },
    {
      "val": "velusamy",
      "offset": 58
    },
    {
      "val": "42/17",
      "offset": 69
    },
    {
      "val": "1236547896321456",
      "offset": 77
    },
    {
      "val": "VISA",
      "offset": 96
    },
    {
      "val": "February",
      "offset": 103
    },
    {
      "val": "2022",
      "offset": 114
    },
    {
      "val": "258",
      "offset": 125
    }
  ],
  "location": "AdactinStep.user_enter_the_details_in_booking_hotel_page_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 15831834597,
  "status": "passed"
});
formatter.after({
  "duration": 752056532,
  "status": "passed"
});
});