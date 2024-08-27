Feature: To verify facebook search functionality

@smoketest
Scenario: Validate facebook page is working
Given Browser is open
When User is on the facebook login page
And the user type the email and password
And hit login button
Then facebook page should be opened
