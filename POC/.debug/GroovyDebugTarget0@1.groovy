























				open("https://finance.yahoo.com/")
				Thread.sleep(5000)

				driver=stockweb.getWrappedObject();
				WebDriverWait wait = new WebDriverWait(driver, 120)

				
				map = new HashMap();
				
				outputItemsList= new ArrayList();
				
				for(test in data){

					//println test.CompanyList.toString()

					
					//$(byAttribute("aria-label", "Search")).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),test.CompanyList.toString())
					wait.until(ExpectedConditions.visibilityOfElementLocated(byAttribute("aria-label", "Search"))).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),test.CompanyList.toString())
					//Thread.sleep(5000)
					wait.until(ExpectedConditions.visibilityOfElementLocated(byId("search-buttons"))).click()
					Thread.sleep(5000)
					String Stock_price = $(byXpath('//*[@id="quote-header-info"]/div[3]/div/div/span[1]')).getText();
					String company_name = test.CompanyList.toString();
					
					//Thread.sleep(5000)
					/* outputItemsList.add(Stock_price);
					outputItemsList.add(test.CompanyList.toString()); */
					
					
					map.put("Stock_price", Stock_price);
					map.put("company name", company_name);
					
					
					
					println "Stock_price-----------"+Stock_price
					println "company name-----------"+company_name
					
					println map
					
					outputItemsList.add(map);


				}
				
				
				println "Stock_Map-----------"+map
				
				println "Stock_LIst-----------"+outputItemsList
				
			