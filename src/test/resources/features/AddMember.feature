@AddMember
Feature: Adding Member Feature

  @AddMemberMandatoryFields
  Scenario: Adding Member with Mandatory Fields
    Given I have 10 cukes in my belly
    Then I print

  @AddMemberAllFields
  Scenario: Adding Member with all Fields
    Given I have 7 cukes in my bellies
    When I login with credentials
    | user1 | pass1 |
    | user2 | pass2 |
    | user3 | pass3 |
