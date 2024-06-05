Feature: Shopiness Testing

  Background:
    Given open shoppe app

  @Shoppiness_TC_01
  Scenario: Verify Home Screen
    Given Click to Bat dau trai nghiem
    When I click to Deny
    Then The Home screen should displayed
    And The menu footer should displayed

  @Shoppiness_TC_02
  Scenario: Verify Thuong Hieu screen
    Given I am in Home Screen
    When I click to Mua Sam Online
    And I click to Thuong Hieu
    Then The screen should be displayed 4 branch name

  @Shoppiness_TC_03
  Scenario: Verify Uu Dai screen
    Given I am in Home Screen
    When I click to Mua Sam Online
    And I click to Uu Dai
    Then I click to the first item
    And The screen should be displayed with some item

  @Shoppiness_TC_04
  Scenario: Verify Voucher screen
    Given I am in Home Screen
    When I click to Mua Sam Online
    And I click to Voucher
    Then I swipe and click to the last Voucher
    And The screen should be displayed with some items

  @Shoppiness_TC_05
  Scenario: Verify Ca Nhan screen
    Given I am in Home Screen
    When I click to Ca Nhan
    Then The screen should be displayed 4 tabs