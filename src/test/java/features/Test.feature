Feature: To verify API automation with Cucumber

Scenario Outline: Verify the get service
Given I want to execute reqres endpoint
When I submit the request with <pageno> as parameter
Then I should get <code> as response code



Examples:
|pageno|code|
|1|200|
|2|200|


Scenario: Verify the get service without parameter
Given I want to execute reqres endpoint
When I submit the request with NA as parameter
Then I should get 400 as response code



