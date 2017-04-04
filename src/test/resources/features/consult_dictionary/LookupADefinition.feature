Feature: Search on the web
  As an user
  I want to search on the web
  So that I can see results

  Scenario: As User I want to search
    Given the page is open with url "http://rozetka.com.ua/telefony-tv-i-ehlektronika/c4627949/"
    When User search for 'cucumber'
    Then User browser's title should contain "Закрыть"

