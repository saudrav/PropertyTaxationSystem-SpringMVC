package saudrav.springframework.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import saudrav.springframework.model.PropertyTaxPyt;

@Repository
public class PropertyTaxPytRepositoryImpl implements PropertyTaxPytRepository{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<PropertyTaxPyt> getAll() {
		
		return jdbcTemplate.query("select * from propertytax", new RowMapper<PropertyTaxPyt>() {

			@Override
			public PropertyTaxPyt mapRow(ResultSet rs, int rowNum) throws SQLException {
				PropertyTaxPyt propertyTaxPyt = new PropertyTaxPyt();
				propertyTaxPyt.setPropertyId(rs.getString("propertyId"));
				propertyTaxPyt.setOwnersName(rs.getString("ownersName"));
				propertyTaxPyt.setAreaInSqFt(rs.getDouble("areaInSqFt"));
				propertyTaxPyt.setPropertyType(rs.getString("propertyType"));
				propertyTaxPyt.setTaxAmount(rs.getDouble("taxAmount"));
				propertyTaxPyt.setDateOfPyt(rs.getDate("dateofPyt"));
				propertyTaxPyt.setDueDate(rs.getDate("dueDate"));
				propertyTaxPyt.setRevisedTaxAmt(rs.getDouble("revisedTaxAmtInRs"));

				return propertyTaxPyt;
			}
		});
	}

	
	@Override
	public void addAll(List<PropertyTaxPyt> propertyTaxPyts) {
		
		for (PropertyTaxPyt ptp : propertyTaxPyts) {
		
			jdbcTemplate.update("insert into propertytax values(?,?,?,?,?,?,?,?)", ptp.getPropertyId(), ptp.getOwnersName(),
					ptp.getAreaInSqFt(), ptp.getPropertyType(), ptp.getTaxAmount(), ptp.getDateOfPyt(), ptp.getDueDate(), 
					ptp.getRevisedTaxAmt());
		}
	}
}
