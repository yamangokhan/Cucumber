Feature: Amazon Search

  Scenario: TC01 kullanici Amazonda Nutella aratir

    Given kullanıcı amazon anasayfasında
    Then kullanıcı Nutella için arama yapar
    And sonucların Nutella içerdiği test eder
    And sayfayi kapatir

  Scenario: TC02 kullanici Amazonda Java aratir
    Given kullanıcı amazon anasayfasında
    Then kullanıcı Java için arama yapar
    And sonucların Java içerdiği test eder
    And sayfayi kapatir

  Scenario: TC03 kullanıcı Amazonda Iphone aratir
    When kullanıcı amazon anasayfasında
    And kullanıcı Iphone ıcın arama yapar
    And sonucların Iphone içerdiği test eder
    And sayfayi kapatir