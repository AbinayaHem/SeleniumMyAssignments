Feature:  Create Account on Salesforce site

Scenario: Create Account

	Given Load the url

	And enter the username

	And Enter the password

	When Click on the login button

	Then Verify homepage is displayed

	When Click on toggle menu

	And Click View All

	And Click Sales from App Launcher

	And Click on Accounts tab

	And Click on New button

	And Enter Account name

	And Select Ownership

	And Click Save

	Then Verify Account name