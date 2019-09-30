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
@FunctionalTest
Feature: Tags Functionality
 To Test tags Functionality

	Background: Background Functionality
		Given Test one Background
		When Test two background
		Then Test three background
		
  @SmokeTest
  Scenario: test smoke functionality
    Given Its a smoke first test
    When Its a smoke second test
    Then Its a smoke third test

  @RegressionTest
  Scenario: Test regression functionality
    Given Its a regression first step
    When Its a regression second step
    Then Its a regression third step

	@IntegrationTest
	Scenario: Test Integration Functionality
	Given Its a integration first step
	When Its a integration second step
	Then Its a integration third step
    