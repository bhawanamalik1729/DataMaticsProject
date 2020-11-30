Feature: Five Day Weather forecast

Scenario Outline: Weather Forecast for valid city
Given Open the browser 
When Enter the URL 
And  enter valid "<city>"
And Hit enter.
Then User must successfully display five days Weather Forecast

Examples:
|city|
|aberdeen|
|perth|

Scenario: Weather Forecast for invalid city.
Given Browser is open 
When User enter URL
And User enter invalid city.
And  Hit on enter.
Then verify error message.
