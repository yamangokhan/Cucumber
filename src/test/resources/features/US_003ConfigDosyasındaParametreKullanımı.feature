Feature: US_003 kullanıcı parametre ile configuration file 'i kullanabilmeli

  @config
  Scenario: TC_003 Configuration Properties dosyasından parametre kullanımı

    Given kullanıcı "amazonURL" anasayfasında
    Then kullanıcı 3 saniye bekler
    And  url'in "amazon" içerdiğini test eder
    Then sayfayi kapatir
