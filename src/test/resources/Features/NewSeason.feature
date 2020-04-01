Feature: Create New season in qakripya.com

  @Scenario1
  Scenario Outline: User creates New season for a product
    Given User launches centric application
    And User selects language "<language>"
    Then Go to homepage
    And verify user screen
    And Click style tab and get the listed season name in the style tab
    When User create New season with mandatory deatails for season creation "<style>","<scode>","<sdescription>"
    Then Click New Brand
    And Create Brand by providing valid and mandatory data "<brand>","<bcode>","<bdescription>"
    Then Save the New Brand which was created
    Then Click New department by providing valid data  "<dept>","<dcode>","<ddescription>"
    Then Save the New department which was created
    Then Click New collection
    And Create collection by providing valida and mandatory details "<collection>","<ccode>","<cdesription>"
    Then Save the collection which was created
    Then Click New style
    And Create Style followed by its style Type "<styletype>"
    Then Go to homepage
    # Then select the image from the avilable resource
    Then Verify the created season, Brand, Department, Collection and Style which was created.
    Then Logout from the Application

    Examples: 
      | language           | style   | scode | sdescription | brand | bcode | bdescription | dept | dcode | ddescription | collection | ccode  | cdesription | styletype |
      | Italian (Italiano) | autumn8 |   203 | new model    | brand |   201 | otto         | dept | ot01  | shirts       | collection | Cot001 | cotton      | Apparel   |
