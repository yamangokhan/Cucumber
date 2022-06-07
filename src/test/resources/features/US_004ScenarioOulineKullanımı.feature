# amazon sayfasına gidip sırasyla, nutella, java, elma, armut aratıp
  # sonucların arama yaptıgımız kelimeyi içerdiğini test edelim

Feature: US_004 Kullanıcı Amazon websitesinde istediği kelimeleri aratır

  Scenario Outline: TC_004 kullanıcı Amazon websitesinde listedeki elementleri aratma
    Given kullanıcı "amazonURL" anasayfasında
    Then kullanıcı "<istenenKelime>" için arama yapar
    And sonucların "<istenenKelime>" içerdiği test eder
    And sayfayi kapatir
    Examples:
      | istenenKelime |
      | nutella       |
      | java          |
      | elma          |
      | armut         |