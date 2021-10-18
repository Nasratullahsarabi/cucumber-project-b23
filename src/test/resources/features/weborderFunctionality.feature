Feature: Weborder page should work as expected

  @wip
  Scenario: User should see all products from the list according to available product
    Given we are at web order login page
    And we provide valid credential
    When we select "Order" tab from sidebar
    Then we should see bellow options in product dropdown list
      | MyMoney     |
      | FamilyAlbum |
      | ScreenSaver |