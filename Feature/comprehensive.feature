Feature: Verify flight search

Scenario: Verification of flight search
Given launch url
When click on flights
And select round trip
And select From location "HYD"
And select To location "MAA"
And select departure date
And select return date
And click on search flights
Then verify search page is displayed