Feature: API workflow test

  Background: for generating the token before every request
    //to generate the token for all the request, we kept it here in background
    Given a JWT is generated

  @api
  Scenario: API test case for creating the employee
    Given a request is prepared for creating an employee
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    Then the response body contains key "Message" and value "Employee Created"
    And the employee id "Employee.employee_id" is stored as global to be used for other request

    @api
    Scenario: Getting the created employee
      Given a request is prepared for getting a created employee
      When a GET call is made to get this employee
      Then the status code for this emp is 200
      And the employee id "employee.employee_id" should match with global emp id
      And the retrieved data at "employee" object should match with the data used for creating the employee
      |emp_firstname|emp_lastname|emp_middle_name|emp_gender|emp_birthday|emp_status|emp_job_title|
      |Aidann       |Nur         |MS             |Female       |1995-01-25  |Confirmed |QA Tester    |


  @api
  Scenario: API test case for creating the employee using json body
    Given a request is prepared for creating an employee by passing json body
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    Then the response body contains key "Message" and value "Employee Created"
    And the employee id "Employee.employee_id" is stored as global to be used for other request

  @apidynamic
  Scenario: API test case for creating the employee using json body
    Given a request is prepared for creating an employee with dynamic data "Aidann", "Nur", "MS", "F", "1995-01-25", "Confirmed", "QA Tester"
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    Then the response body contains key "Message" and value "Employee Created"
    And the employee id "Employee.employee_id" is stored as global to be used for other request


