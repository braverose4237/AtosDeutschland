@FNW-561
Feature: Default

	@FNW-559
	Scenario: Check Facebook Links of Atos.net
		Scenario:
		    When user is on the Atos Page
		    And user deny to Cookies
		    And user click Facebook Link
		    Then check user on the facebook WebSite	

	@FNW-558
	Scenario: Check InstagramLinks of Atos.net
		Scenario:
		    When user is on the Atos Page
		    And user deny to Cookies
		    And user click instagram Link
		    Then check user on the instagram WebSite

	@FNW-560
	Scenario: Check Xing Links of Atos.net
		Scenario:
		    When user is on the Atos Page
		    And user deny to Cookies
		    And user click Xing Link
		    Then check user on the Xing WebSite