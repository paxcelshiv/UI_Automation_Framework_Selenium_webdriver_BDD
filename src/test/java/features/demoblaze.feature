Feature: Open the demoblaze website and puchase laptop from this website 
I will open the site, add product to card ,Navigate to card, place order with required assertion. 

Scenario: 
	Open the demoblaze site and Customer navigation through product categories 
	Given Enter the website page url as "https://www.demoblaze.com/index.html" 
	Then validate home page with logo "PRODUCT STORE" 
	When Click on Phones button 
	Then To validate for open phones tab with "Samsung galaxy s6" name 
	When Click on Laptops button 
	When Click on Monitors button 
	
Scenario: 
	Navigate to Laptop then add Sony vaio i5 after that Add to cart and Accept pop up confirmation 
	When Again Click on Laptops button 
	When Again Click on Sony vaio i link 
	When click on Add to cart button 
	When Accept pop up confirmation as click on OK button 
	
Scenario: 
	Navigate to Laptop then add Dell i7 8gb after that Add to cart and Accept pop up confirmation 
	When Click on Home button 
	When Click on again Laptops textLink 
	When Click on Dell i gb link 
	When Again click on Add to cart button 
	When Again Accept pop up confirmation as click on OK button 
	
Scenario: Navigate to Cart and Delete Dell i7 8gb from cart 
	When Click on Cart text link 
	When Click on delete link for Delete Dell i7 8gb laptop 
	
Scenario: Click on Place order 
	When Click on Place order button 
	
Scenario: Fill in all web form fields 
	Then Enter details into the web form 
	
	| Shiv Badan |
	| India |
	| Noida |
	| 566567676767 |
	| 7 |
	| 2025 |
	Then  I Clicked on the Purchase button 
	
	Scenario: Capture and log purchase Id and Amount 
	Then  I Capture screenshot 
	Then  purchase Id and Amount 
	
	Scenario: Assert purchase amount equals expected 
	Then  I Asserted purchase id 
	Then  I Asserted amount
	Scenario: Closed Browser
	Then  I closed browser
	
	
