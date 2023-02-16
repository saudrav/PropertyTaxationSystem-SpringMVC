package saudrav.springframework.services;

import java.util.List;

import saudrav.springframework.model.PropertyTaxPyt;

public interface PropertyTaxPytService {

	List<PropertyTaxPyt> getAll();

	void addAll(List<PropertyTaxPyt> propertyTaxPyt);
}
