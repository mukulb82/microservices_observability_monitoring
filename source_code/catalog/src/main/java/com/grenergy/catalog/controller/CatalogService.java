package com.grenergy.catalog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CatalogService {

	
	public boolean createCatalog(String catalogName) {
		// catalog for groceries products - milk, lentils, vegetables, fruits, dairy, meat, oil, condiments, grains
		
		
		boolean catalogPresent = false;
		List<String> groceries = populateCatalogue();
		
		if(groceries != null && groceries.size() > 0 && groceries.contains(catalogName)) {
			
			catalogPresent = true;
		}
		
		else {
			
			// cataloge NOt found - 204
			
			throw new CatalogueException ("204 !! Resource/Catalogue not found");
			
		}
		System.out.println("Called service of Catalog, param = " + catalogName);
		return catalogPresent;
	}

	private List<String> populateCatalogue() {
		
		List<String> groceries = new ArrayList<String>();
		
		
		groceries.add("milk");
		groceries.add("lentils");
		groceries.add("vegetables");
		groceries.add("fruits");
		groceries.add("dairy");
		groceries.add("oil");
		groceries.add("meat");
		groceries.add("fish");
		groceries.add("condiments");
		groceries.add("rains");
		
		return groceries;
	}

}
