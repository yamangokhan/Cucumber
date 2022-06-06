Feature: US_002 Kullanıcı Parametre kullanarak arama yapabilmesli

  @parametre
  Scenario: TC_002 Kullanıcı parametre ile amazonda arama yapabilmeli
    Given kullanıcı amazon anasayfasında
    And kullanıcı "Nutella" için arama yapar
    And sonucların "Nutella" içerdiği test eder
    Then sayfayi kapatir

    