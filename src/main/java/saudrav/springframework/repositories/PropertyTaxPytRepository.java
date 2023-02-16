package saudrav.springframework.repositories;

import java.util.List;

import saudrav.springframework.model.PropertyTaxPyt;

public interface PropertyTaxPytRepository {
	
	List<PropertyTaxPyt> getAll();

	void addAll(List<PropertyTaxPyt> propertyTaxPyt);

}
