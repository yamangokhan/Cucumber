Feature:Deneme

  Scenario: TC01_ The user crate appointment succesfully
  @wag
    Given user goes "https://ekip.co/"
    When the user clicks "contact" button
    Then the user clicks "Let's talk" button on the homepage
    And the user selects any month
    And the user selects any day
    And the user selects any hour
    And the user enters valid name into name textbox
    And the user enters valid email into email textbox
    And the user enters valid phone number into phone number textbox
    And the user cliks "Schedule Appointment" button
    And the user verifies message on the pop-up visible