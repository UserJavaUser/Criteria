package by.tc.task01.dao.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.dao.ApplianceReader;
import by.tc.task01.dao.ApplianceDAOException;
import by.tc.task01.dao.ApplianceMatcher;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) throws ApplianceDAOException {

		try {
			final String file = "resources\\appliances_db.txt";
			ApplianceReader reader = new ApplianceReader(file);
			ApplianceMatcher matcher = new ApplianceMatcher();
			ApplianceFactory factory = new ApplianceFactory();

			List<String> strAppliancesData = null;
			List<Appliance> appliances = null;

			strAppliancesData = reader.readApplianceType(criteria.getGroupSearchName());
			strAppliancesData = matcher.match(strAppliancesData, criteria);

			appliances = factory.create(strAppliancesData);
			return appliances;
		}catch (Exception e){
			throw new ApplianceDAOException(e);
		}
	}

}

