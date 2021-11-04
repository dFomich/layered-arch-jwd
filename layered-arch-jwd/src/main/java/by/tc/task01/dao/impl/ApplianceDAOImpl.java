package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import jdk.internal.module.Resources;
import by.tc.task01.dao.parser.Parser;
import by.tc.task01.dao.parser.XMLParser;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

	@Override
	public List<Appliance> find(Criteria criteria) {
		Parser parser = new XMLParser();
		try {
			URL path = ApplianceDAOImpl.class.getResource("/file.xml");
			parser.parse(path.getPath());
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}

		return parser.take(criteria);
	}

}
