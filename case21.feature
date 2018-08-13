
Feature: Adding and removing items to cart
  I want to use this template for my feature file

  @tag1
  Scenario: Customer can add item to cart
  Given Customer is on product page
  When Customer clicks on 'add to cart' 
  Then Product has to be added to cart
  
  
  @tag2
  Scenario: Customer can delete item from cart
  Given Customer is on cart page
  When Customer clicks on 'delete from cart' 
  Then Product has to be deleted from cart
  
  
 