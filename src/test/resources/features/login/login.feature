Feature: Validate login

  Background:
    Given Sergey is researching products on the Sauce Labs page

  Scenario: Verify if a standard user is able to login by entering valid credentials and clicking on the 'Login' button.
    When he login with valid credentials. Username: "standard_user" Password: "secret_sauce"
    Then he should see a section about "PRODUCTS"

  Scenario: Verify that the validation message is displayed in the case of a blocked-out user login by entering valid credentials and clicking on the 'LOGIN' button.
    When he login with locked-out credentials. Username: "locked_out_user" Password: "secret_sauce"
    Then he should see a validation message that would say: "Epic sadface: Sorry, this user has been locked out."

  Scenario: Verify that the User is not able to log in with invalid credentials
    When he login with invalid credentials. Username: "invalid_user" Password: "invalid_sauce"
    Then he should see a validation message that would say: "Epic sadface: Username and password do not match any user in this service"

