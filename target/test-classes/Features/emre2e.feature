Feature: EMR features
Scenario:  user login
Given Open EMR website
And update username as "admin"
And update password as "pass"
And click on login
And navigate on to patient/client
And click on New/Search
And add the first name
And add last name
And Update DOB as todays date (According to IST)
And Update the Gender
And click on the create new patient button
And click on confirm create new patient button
And validate the alert message
And Click on Billy Smith from Menu bar at the right corner for logout
Then should display message as "Test Passed"