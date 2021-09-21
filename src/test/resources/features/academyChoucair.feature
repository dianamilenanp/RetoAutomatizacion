#Autor: Diana Niño
@stories
  Feature: Academy Choucair
    As a user I want to register on the Utest.com page to learn about software tests
    @scenario1
  Scenario: Succesful register on the page Utest.com
    Given that Pedro wants register on the page Utest.com

      When he fills out the form
      |strFirstName    |strLastName  |strEmail             |strMonth  |strDay |strYear    |strPassword  |strConfirmPassword | booTerms  |booPolicy  |
      |Pedro           |pruebas      |pedro2.prueba@gmail.com|June     |15     |1996     |Prueba987*   |Prueba987* |true      |true       |
    Then he can enter the page
      |strfinalRegistration    |
      |<strfinalRegistration>  |