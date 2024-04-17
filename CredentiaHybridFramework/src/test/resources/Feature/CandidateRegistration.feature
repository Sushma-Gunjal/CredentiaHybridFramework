
Feature: Candidate Registration Page

  @tag1
  Scenario: Registration
 Given when canidate launch url
 And Provide values to all the fields 
 And submit an registration form
 Then successfully candidate register to an application
 

 
 @tag2
 Scenario: canidate Login page
 Given candidate is on login page
 And provides <Username> and <password>
 And click on login button
 Then canidate successfully loggedin and home page displayed
 
 
 
 
 