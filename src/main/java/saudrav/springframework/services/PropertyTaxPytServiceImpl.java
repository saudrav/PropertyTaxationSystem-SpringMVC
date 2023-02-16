package saudrav.springframework.services;

import java.util.List;

import org.springframework.stereotype.Service;

import saudrav.springframework.model.PropertyTaxPyt;
import saudrav.springframework.repositories.PropertyTaxPytRepository;

@Service
public class PropertyTaxPytServiceImpl implements PropertyTaxPytService{
	
	private PropertyTaxPytRepository propertyTaxPytRepository;

	public PropertyTaxPytServiceImpl(PropertyTaxPytRepository propertyTaxPytRepository) {
		
		this.propertyTaxPytRepository = propertyTaxPytRepository;
	}


	@Override
	public List<PropertyTaxPyt> getAll() {
		return propertyTaxPytRepository.getAll();
	}


	@Override
	public void addAll(List<PropertyTaxPyt> propertyTaxPyt) {
		propertyTaxPytRepository.addAll(propertyTaxPyt);
	}

}
