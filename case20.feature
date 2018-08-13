
Feature: Adding promos and discount vouchers
  I want to use this template for my feature file

  @tag1
  Scenario: Admin can add promos and discount vouchers
  Given Admin is on home page
  When Admin clicks on add promos button
  Then Admin should redirected to addPromos page
  
  When Admin is on addPromos page
  And Admin enter promo code & expiry date in text fields
  And clicks on addPromo button
  
  Then promo code should successfully added to database
  
  
  @tag2
  Scenario: Marchant can add promos and discount vouchers
  Given Marchant is on home page
  When Marchant clicks on add promos button
  Then Marchant should redirected to addPromos page
  
  When Marchant is on addPromos page
  And Marchant enter promo code & expiry date in text fields
  And clicks on addPromo button
  
  Then promo code should successfully added to database
 
    