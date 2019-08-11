#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Set up a meeting on the WebEx portaland cancel it

@tag1
Scenario: Title of your scenario
Given User Opens Browser and enter url "http://newtours.demoaut.com/"
When User Navigate to Registration Page
|First Name|Last Name|Phone|Email  |Address|City|State/Province|Postal Code|Country|User Name|Password|Confirm Password|
| Mayur    | Pawar   |12345|x@y.com|Pune   |Pune|Maharashtra   |411030     |India  |MP@123   |MP123   |MP123           |
#And User enters credentials
#| UsesrName | Password | 
#| xyz       | abc@123  |
Then User books flight Successfully

#  @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

#    Examples: 
#      | name  | value | status  |
#      | name1 |     5 | success |
#      | name2 |     7 | Fail    |
