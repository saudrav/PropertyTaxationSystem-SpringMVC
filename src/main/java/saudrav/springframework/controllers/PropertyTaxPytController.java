package saudrav.springframework.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import saudrav.springframework.exception.PropertyTaxPytException;
import saudrav.springframework.model.PropertyTaxPyt;
import saudrav.springframework.services.PropertyTaxPytService;
import saudrav.springframework.services.PropertyTaxationUtilService;

@Controller
public class PropertyTaxPytController {
	
	@Autowired
	private PropertyTaxationUtilService propertyTaxationUtilService;
	
	
	private PropertyTaxPytService propertyTaxPytService;
	
	public PropertyTaxPytController(PropertyTaxPytService propertyTaxPytService) {

		this.propertyTaxPytService = propertyTaxPytService;
	}
	
	
	@GetMapping("/")
	public String showHomePage() {
		return "home";
	}

	
	@PostMapping("add")
	public String addAllRecords() throws PropertyTaxPytException {

		List<PropertyTaxPyt> propertyTaxPyt = propertyTaxationUtilService.addPropTaxDetails("inputfeed.txt");
		propertyTaxPytService.addAll(propertyTaxPyt);
		
		return "add";
		
	}


	@GetMapping("add")
	public ModelAndView showIndexPage() throws PropertyTaxPytException {		

		ModelAndView mv = new ModelAndView("add");
		List<PropertyTaxPyt> propertyTaxPyts = propertyTaxPytService.getAll();
		mv.addObject("propertyTaxPyts", propertyTaxPyts);
		return mv;
		
	}
	
}
