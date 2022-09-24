Feature: Validate login

  Background:
    Given Sergey is researching things on the internet

  Scenario: Verify if a standard user is able to login by entering valid credentials and clicking on the 'Login' button.
    When he login with valid credentials. Username: "standard_user" Password: "secret_sauce"
    Then he should see a section about "PRODUCTS"

