$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ForecastDetails.feature");
formatter.feature({
  "line": 1,
  "name": "Five Day Weather forecast",
  "description": "",
  "id": "five-day-weather-forecast",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Weather Forecast for valid city",
  "description": "",
  "id": "five-day-weather-forecast;weather-forecast-for-valid-city",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the URL",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter valid \"\u003ccity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Hit enter.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User must successfully display five days Weather Forecast",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "five-day-weather-forecast;weather-forecast-for-valid-city;",
  "rows": [
    {
      "cells": [
        "city"
      ],
      "line": 11,
      "id": "five-day-weather-forecast;weather-forecast-for-valid-city;;1"
    },
    {
      "cells": [
        "aberdeen"
      ],
      "line": 12,
      "id": "five-day-weather-forecast;weather-forecast-for-valid-city;;2"
    },
    {
      "cells": [
        "perth"
      ],
      "line": 13,
      "id": "five-day-weather-forecast;weather-forecast-for-valid-city;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Weather Forecast for valid city",
  "description": "",
  "id": "five-day-weather-forecast;weather-forecast-for-valid-city;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the URL",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter valid \"aberdeen\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Hit enter.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User must successfully display five days Weather Forecast",
  "keyword": "Then "
});
formatter.match({
  "location": "ForeCastDetails.open_the_browser()"
});
formatter.result({
  "duration": 7089835458,
  "status": "passed"
});
formatter.match({
  "location": "ForeCastDetails.enter_the_URL_http_localhost()"
});
formatter.result({
  "duration": 1548470384,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aberdeen",
      "offset": 13
    }
  ],
  "location": "ForeCastDetails.enter_valid(String)"
});
formatter.result({
  "duration": 1077166878,
  "status": "passed"
});
formatter.match({
  "location": "ForeCastDetails.hit_enter()"
});
formatter.result({
  "duration": 384874201,
  "status": "passed"
});
formatter.match({
  "location": "ForeCastDetails.user_must_successfully_display_five_days_Weather_Forecast()"
});
formatter.result({
  "duration": 623158068,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Weather Forecast for valid city",
  "description": "",
  "id": "five-day-weather-forecast;weather-forecast-for-valid-city;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter the URL",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enter valid \"perth\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Hit enter.",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User must successfully display five days Weather Forecast",
  "keyword": "Then "
});
formatter.match({
  "location": "ForeCastDetails.open_the_browser()"
});
formatter.result({
  "duration": 5237549473,
  "status": "passed"
});
formatter.match({
  "location": "ForeCastDetails.enter_the_URL_http_localhost()"
});
formatter.result({
  "duration": 1498108321,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "perth",
      "offset": 13
    }
  ],
  "location": "ForeCastDetails.enter_valid(String)"
});
formatter.result({
  "duration": 1042159881,
  "status": "passed"
});
formatter.match({
  "location": "ForeCastDetails.hit_enter()"
});
formatter.result({
  "duration": 488646910,
  "status": "passed"
});
formatter.match({
  "location": "ForeCastDetails.user_must_successfully_display_five_days_Weather_Forecast()"
});
formatter.result({
  "duration": 582190963,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Weather Forecast for invalid city.",
  "description": "",
  "id": "five-day-weather-forecast;weather-forecast-for-invalid-city.",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User enter URL",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enter invalid city.",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Hit on enter.",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "verify error message.",
  "keyword": "Then "
});
formatter.match({
  "location": "ForecastforInvalidCity.browser_is_open()"
});
formatter.result({
  "duration": 5157618328,
  "status": "passed"
});
formatter.match({
  "location": "ForecastforInvalidCity.user_enter_URL()"
});
formatter.result({
  "duration": 1570988151,
  "status": "passed"
});
formatter.match({
  "location": "ForecastforInvalidCity.user_enter_invalid_city()"
});
formatter.result({
  "duration": 967085932,
  "status": "passed"
});
formatter.match({
  "location": "ForecastforInvalidCity.hit_on_enter()"
});
formatter.result({
  "duration": 177170578,
  "status": "passed"
});
formatter.match({
  "location": "ForecastforInvalidCity.verify_error_message()"
});
formatter.result({
  "duration": 763210597,
  "status": "passed"
});
formatter.uri("HourlyForecast.feature");
formatter.feature({
  "line": 1,
  "name": "3 hourly forecast",
  "description": "",
  "id": "3-hourly-forecast",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Select day, get 3 hourly forecast",
  "description": "",
  "id": "3-hourly-forecast;select-day,-get-3-hourly-forecast",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User enter city name",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Hit enter",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "select day column",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Display three hourly forecast on page.",
  "keyword": "Then "
});
formatter.match({
  "location": "ForecastHourly.user_is_on_URL()"
});
formatter.result({
  "duration": 6244200175,
  "status": "passed"
});
formatter.match({
  "location": "ForecastHourly.user_enter_city_name()"
});
formatter.result({
  "duration": 1110173830,
  "status": "passed"
});
formatter.match({
  "location": "ForecastHourly.hit_enter()"
});
formatter.result({
  "duration": 452660092,
  "status": "passed"
});
formatter.match({
  "location": "ForecastHourly.select_day_column()"
});
formatter.result({
  "duration": 192997996,
  "status": "passed"
});
formatter.match({
  "location": "ForecastHourly.display_three_hourly_forecast_on_page()"
});
formatter.result({
  "duration": 565082415,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Select day again, hide 3 hourly forecast",
  "description": "",
  "id": "3-hourly-forecast;select-day-again,-hide-3-hourly-forecast",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on browser",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "enter city name.",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on day",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "again click on day",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "hide 3 hourly forecast from page.",
  "keyword": "Then "
});
formatter.match({
  "location": "ForecastHideHourly.user_is_on_browser()"
});
formatter.result({
  "duration": 5833456802,
  "status": "passed"
});
formatter.match({
  "location": "ForecastHideHourly.enter_city_name()"
});
formatter.result({
  "duration": 1494851691,
  "status": "passed"
});
formatter.match({
  "location": "ForecastHideHourly.click_on_day()"
});
formatter.result({
  "duration": 131143140,
  "status": "passed"
});
formatter.match({
  "location": "ForecastHideHourly.again_click_on_day()"
});
formatter.result({
  "duration": 129245798,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 5
    }
  ],
  "location": "ForecastHideHourly.hide_hourly_forecast_from_page(int)"
});
formatter.result({
  "duration": 522222122,
  "status": "passed"
});
});