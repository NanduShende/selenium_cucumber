$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homePage.feature");
formatter.feature({
  "line": 3,
  "name": "Verify Catalog functionality",
  "description": "I want to use this template for my feature file",
  "id": "verify-catalog-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.before({
  "duration": 4525907012,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Title of your scenario",
  "description": "",
  "id": "verify-catalog-functionality;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 9,
      "value": "#    And I enter city name on home page"
    }
  ],
  "line": 10,
  "name": "I click on \"offer tab\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I verify text \"Dubai Special Packages\" is present",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "duration": 9924551459,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "offer tab",
      "offset": 12
    }
  ],
  "location": "HomePageStep.i_click_on(String)"
});
formatter.result({
  "duration": 6899022584,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dubai Special Packages",
      "offset": 15
    }
  ],
  "location": "HomePageStep.i_verify_text_is_present(String)"
});
formatter.result({
  "duration": 174529149,
  "status": "passed"
});
formatter.after({
  "duration": 964693110,
  "status": "passed"
});
});