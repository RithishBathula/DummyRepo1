
Feature: upload product image
  I want to use this template for my feature file

  @tag1
  Scenario: Admin can upload images of products
  Given Admin is on addproduct page
  When Admin clicks on upload image
  And selects the proper file
  Then image file should be uploaded successfully
  
  @tag2
  Scenario: Merchant can upload images of products
  Given Merchant is on addproduct page
  When Merchant clicks on upload image
  And selects the proper file
  Then image file should be uploaded successfully
 