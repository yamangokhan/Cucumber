@wip
Feature: US_001 kullanıcı ortak adımları Backround ile calıstırır

  Background: ortak adim
    Given kullanıcı amazon anasayfasında


    Scenario: TC_004 amazon nutella aratma
      And kullanıcı Nutella için arama yapar
      Then sonucların Nutella içerdiği test eder
      And sayfayi kapatir

      Scenario: TC_005 amazon java aratma
        And kullanıcı Java için arama yapar
        Then sonucların Java içerdiği test eder
        And sayfayi kapatir
