package by.tc.task01.dao.parser;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

public interface Parser {

	void parse(String path) throws ParserConfigurationException, SAXException, IOException;

	List<Appliance> take(Criteria criteria);
}
