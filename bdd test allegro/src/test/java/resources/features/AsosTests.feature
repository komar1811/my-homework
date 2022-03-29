Feature: Test scenarios for Asos

  Scenario: Login To Asos
    Given User is on "Main Page"

    When User goes from "Main Page" to "Login Page" and enters username as "jango.rango18@gmail.com" and password "Kooalu1811!"

    Then User is successfully navigated to the "https://www.asos.com/web/pages/identity-redirect.html?lang=en-GB&store=COM&countryCode=GB&keyStoreDataversion=dup0qtf-35&finalredirecturi=https%3A%2F%2Fwww.asos.com%2F#"
    And User name is "Ostap" on "Main Page" is present on dropdown menu

  Scenario Outline: Login to Asos (negative)
    Given User is on "Main Page"

    When User goes from "Main Page" to "Login Page" and enters incorrect username as "<username>" and password "<password>"

    Then User gets error message "Looks like either your email address or password were incorrect. Wanna try again?" on "Login Page"

    Examples:
      |username| password |
      |ostap.komar18@gmail.com| qwerty |

  Scenario: Country Change
    Given User is on "Main Page"

    When User clicks on country icon on "Main Page" and enters country "Poland"

    Then Country icon "Poland" is present on "Main Page"

  Scenario: Change Currency
    Given User is on "Main Page"

    When User clicks on country icon on "Main Page" and enters "EUR" currency

    Then Euro currency is present on "Clothes Category Page"

  Scenario: Make Favourite
    Given User is on "Main Page"

    When User goes from "Main Page" to add a product to favourites

    Then Favourite Product is displayed on "Favourites Page"

  Scenario: Choose Gender for Clothes
    Given User is on "Main Page"

    When User chooses "Male" on "Main Page"

    Then Title for "Men" is displayed on "Clothes Category Page"

  Scenario: Add to Bag
    Given User is on "Main Page"

    When User goes from "Main Page" to add a product to bag

    Then Clothes counter is visible on the top bar

  Scenario: Remove Clothes
    Given User is on "Main Page"

    When User goes from "Main Page" to add a product to bag and removes clothes on "DropDown Bag Module"

    Then Clothes is not present on "Bag Page"



