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
  "duration": 4292646786,
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
formatter.match({
  "location": "HomePageStep.i_am_on_home_page()"
});
formatter.result({
  "duration": 5918449824,
  "status": "passed"
});
formatter.after({
  "duration": 846705309,
  "status": "passed"
});
});