Feature:The user goes relative URL and create some informations and controls

  @gokhan
  Scenario Outline: US_006 Kullanıcı ilgili sayfaya gider ve işlemleri yapar

    When kullanıcı "dataTableURL" anasayfasında
    Then new butonuna basar
    And kullanıcı isim bölümüne "<firstName>" bilgisi girer

    And kullanıcı soyisim bölümüne "<lastName>" bilgisi girer

    And kullanıcı position bölümüne "<position>" bilgisi girer

    And kullanıcı office bölümüne  "<office>" bilgisi girer

    And kullanıcı extn bölümüne "<extn>" bilgisi girer

    And kullanıcı start date bölümüne "<startDate>" bilgisi girer

    And kullanıcı salary bölümüne "<salary>" bilgisi girer

    And Create tusuna basar

    When kullanici "<firstName>" ile arama yapar

    Then isim bolumunde "<firstName>" oldugunu test eder

    Examples:
      | firstName | lastName | position | office | extn | startDate  | salary |
      | gokhan    | yaman    | QA       | Amazon | -    | 2022-05-10 | 15000  |


