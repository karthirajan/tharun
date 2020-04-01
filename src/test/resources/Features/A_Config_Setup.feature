#Author: karthick@kripya.com
@tag
Feature: Configuration and Setup

  @tag2
  Scenario Outline: style type and material type
    Given User launches centric application
    And User Click on setup icon
   # When User creates style type "<StyleTypeA>","<StyleTypeB>","<StyleTypeC>","<StyleTypeD>"
   # And User fill the style type attributes fields
   # And User creates material type "<Standalone>","<Structurecomponent>","<Tool>"
    And User creates BOM type "<StyleBOM>","<MaterialBOM>"
    And User creates size chart type "<All>","<List>","<Values>","<Tolerance>"
    And User creates spec type "<SpecTypeA>","<SpecTypeB>"
    And User creates test type "<TestTypeA>","<TestTypeB>"
    And User performing delete action on test type
    And User creates inspection type "<InspnoLink>","<BOM>","<SizeChart>","<SpecDS>","<StyleReview>"
    And User creates contractual documents "<ContrctAll>","<Simple>","<RA>","<HED>","<HRD>"
    And User creates LookUp items "<LookUp>"
    And User creates theme master "<All>","<single>","<multiple>","<AVsingle>"
    Then User click on update cnfiguration
    And validate and accept the alert

    Examples: 
      | All           | single           | multiple           | LookUp     | AVsingle                    | ContrctAll | Simple      | RA      | HED      | HRD      | InspnoLink          | BOM             | SizeChart              | SpecDS                      | StyleReview              | StyleTypeA               | StyleTypeB               | StyleTypeC          | StyleTypeD                      | Standalone          | Structurecomponent           | Tool          | StyleBOM    | MaterialBOM  | All         | List              | Values         | Tolerance         | SpecTypeA    | SpecTypeB    | TestTypeA | TestTypeB     |
      | TM-All Season | TM-Single Season | TM-Multiple Season | new lookup | TM-Allow material variation | CDOC-ALL   | CDOC-simple | CDOC-RA | CDOC-HED | CDOC-HRD | Ins Section-No Link | Ins Section-BOM | Ins Section-Size Chart | Ins Section-Spec Data Sheet | Ins Section-Style Review | Apparel - Color and Size | Accessories - Only Color | Apparel - Only Size | Accessories - No color and Size | Fabric - Stanadlone | Fabric - Structure Component | Fabric - Tool | Apparel BOM | Material BOM | SC-Lock All | SC-Lock Dimension | SC-Lock Values | SC-Lock Tolerance | Spec Type-01 | Spec Type-02 | Wash Test | Chemical Test |
