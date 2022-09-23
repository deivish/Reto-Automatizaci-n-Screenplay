@tag1

Feature: test page
  As a user, I want to learn how to automate in screenplay at a page with the login of user.

  @scenario1
  Scenario Outline: Login at page
    Given that I want to put into practice the knowledge of automation the login of a page
    When enter the assigned username and password
      | username   | password |
      | <username> | <password>  |
    Then this will allow you to give access to available products
    Examples:
      | username     | password     |
      | standard_user | secret_sauce |