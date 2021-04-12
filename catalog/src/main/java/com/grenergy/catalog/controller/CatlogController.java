package com.grenergy.catalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service/catalog")
public class CatlogController {

	@Autowired
	CatalogService service;
	
	
	@GetMapping(value = "{catalogName}")
	public boolean createCatalog(@PathVariable("catalogName") String catalogName){
		
		boolean catalogPresent = service.createCatalog(catalogName);
		
		
		return catalogPresent;
		
	}
}
