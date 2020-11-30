Feature: 3 hourly forecast
Scenario: Select day, get 3 hourly forecast
Given User is on URL
When User enter city name
And Hit enter
And select day column
Then Display three hourly forecast on page.

Scenario: Select day again, hide 3 hourly forecast
Given User is on browser
When enter city name.
And  click on day
And again click on day
Then hide 3 hourly forecast from page.
