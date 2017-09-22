@DeleteMember
Feature: Delete Member Feature

  @deleteAdminUser
  Scenario Outline: Deleting an Admin user
    Given I have <test> cukes in my belly
    Then I print

    Examples:
    | test |
    | 1    |
    | 2    |

  @deleteMemberUser
  Scenario: Deleting a Member user
    Given I have 7 cukes in my bellies
    When I login with credentials
    | user1 | pass1 |
    | user2 | pass2 |
    Then I print
