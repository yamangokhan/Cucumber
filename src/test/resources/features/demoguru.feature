

# http://demo.guru99.com/test/web-table-element.php sayfasina gidelim
# Cucumber framework’de US1012_Guru_Web_Tables altinda
Feature: US_008 web tablosundaki istenen sutunu yazdırma

  Scenario: TC001 kullanıcı sutun baslıgı ile liste alabilmeli

    Given kullanıcı "guruURL" anasayfasında
    And kullanıcı "Company" sutunundaki tum degerleri yazdirir
    Then sayfayi kapatir


