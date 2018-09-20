#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@ProductDetail
Feature: 상품 상세 테스트
  cucumber의 feature 시나리오와 katalon의 groovy script 연계 테스트를 FO의 상품 상세 페이지를 대상으로 테스트한다

  @tag1
  Scenario Outline: 상품 상세 페이지 테스트
    Given 브라우저를 오픈한다
    When 상품상세 <category> <productNo> 로 이동한다
    Then 상품명 <productName>, 가격 <price> 을 검증한다    

    Examples: 
      | productNo    | productName       | category | price   |
      | DXHD11841-RD | [공용]소매 로고링 후디     | 공용/후드티   | 109,000 |
      | DWMT82861-OR | [여성]네크 포인트 여성 맨투맨 | 여성/맨투맨   |  89,000 |
