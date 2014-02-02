$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('com\michalvich\cucumber\selenium\example\GoogleSearch.feature');
formatter.feature({
  "id": "search-on-google",
  "description": "As an user\r\nI want to search on Google\r\nSo that I can see results",
  "name": "Search on Google",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "search-on-google;results-are-shown",
  "description": "",
  "name": "results are shown",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "the page is open \"http://www.google.com\"",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I search for \"Cucumber\"",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "a browser title should contains \"Cucumber\"",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.google.com",
      "offset": 18
    }
  ],
  "location": "GoogleSearch2Scenario.the_page_is_open(String)"
});
formatter.result({
  "duration": 698449489,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 14
    }
  ],
  "location": "GoogleSearch2Scenario.I_search_for(String)"
});
formatter.result({
  "duration": 313070595,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 33
    }
  ],
  "location": "GoogleSearch2Scenario.a_browser_title_should_contains(String)"
});
formatter.result({
  "duration": 3282873,
  "status": "passed"
});
formatter.uri('com\michalvich\cucumber\selenium\example\GoogleSearchPasjonaci.feature');
formatter.feature({
  "id": "search-on-google-for-pasjonaci",
  "description": "As an user\r\nI want to search on Google\r\nSo that I can see results",
  "name": "Search on Google for PAsjonaci",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "search-on-google-for-pasjonaci;results-are-shown",
  "description": "",
  "name": "results are shown",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "the page is open \"http://www.google.com\"",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I search for \"Pasjonaci\"",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "a browser title should contains \"Pasjonaci\"",
  "keyword": "Then ",
  "line": 9
});
formatter.step({
  "name": "the page is open2 \"http://www.google.com\"",
  "keyword": "Given ",
  "line": 11
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.google.com",
      "offset": 18
    }
  ],
  "location": "GoogleSearch2Scenario.the_page_is_open(String)"
});
formatter.result({
  "duration": 366890401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pasjonaci",
      "offset": 14
    }
  ],
  "location": "GoogleSearch2Scenario.I_search_for(String)"
});
formatter.result({
  "duration": 266301578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pasjonaci",
      "offset": 33
    }
  ],
  "location": "GoogleSearch2Scenario.a_browser_title_should_contains(String)"
});
formatter.result({
  "duration": 242135,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.google.com",
      "offset": 19
    }
  ],
  "location": "StravaLogin.the_page_is_open(String)"
});
formatter.result({
  "duration": 773755,
  "status": "failed",
  "error_message": "java.lang.NullPointerException\r\n\tat com.michalvich.cucumber.selenium.example.StravaLogin.the_page_is_open(StravaLogin.java:20)\r\n\tat ✽.Given the page is open2 \"http://www.google.com\"(com\\michalvich\\cucumber\\selenium\\example\\GoogleSearchPasjonaci.feature:11)\r\n"
});
});