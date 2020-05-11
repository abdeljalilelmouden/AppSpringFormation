package com.app.WebServiceRest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController; 
@RestController
@CrossOrigin("*")
@RequestMapping(value = "/api/v1")
public class FormationWebServiceRest {
	
 
	@GetMapping(path = "/exportationFormationExcel")
	public String ExportationFormationExcel(){
		return "oui";
	}
}
