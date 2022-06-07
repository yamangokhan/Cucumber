Feature:

  Scenario Outline:

When kullanici "https://editor.datatables.net/" adresine gider
Then new butonuna basar
And tum bilgileri girer
And Create tusuna basar
When kullanici ilk isim ile arama yapar
Then isim bolumunde isminin oldugunu dogrular
    Examples:
      |  |
   # //span[contains(text(),'New')]

  # //input[@id='DTE_Field_first_name']

  # //input[@id='DTE_Field_last_name']

  # //input[@id='DTE_Field_position']

  # //input[@id='DTE_Field_office']

  # //input[@id='DTE_Field_extn']

  # //input[@id='DTE_Field_start_date']

  # //input[@id='DTE_Field_salary']

  # //button[contains(text(),'Create')]

  #//input[@type='search']