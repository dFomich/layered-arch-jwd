package by.tc.task01.service.validation;

import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		boolean isValid = true;
		Set<String> keys = criteria.getKeysSet();
		Iterator<String> iterator = keys.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (!isValueValid(key, criteria.get(key))) {
				isValid = false;
				break;
			}
		}
		return isValid;
	}

	private static boolean isValueValid(String key, Object value) {
		boolean answer;
		switch (key) {
		case "POWER_CONSUMPTION":
		case "WEIGHT":
		case "CAPACITY":
		case "DEPTH":
		case "HEIGHT":
		case "WIDTH":
		case "BATTERY_CAPACITY":
		case "MEMORY_ROM":
		case "SYSTEM_MEMORY":
		case "CPU":
		case "DISPLAY_INCHS":
		case "FREEZER_CAPACITY":
		case "OVERALL_CAPACITY":
		case "MOTOR_SPEED_REGULATION":
		case "CLEANING_WIDTH":
		case "DISPLAY_INCHES":
		case "FLASH_MEMORY_CAPACITY":
		case "CORD_LENGTH":

			answer = isPositiveDouble(value);
			break;
		case "NUMBER_OF_SPEAKERS":
			answer = isPositiveInteder(value);
			break;
		case "OS":
		case "FILTER_TYPE":
		case "BAG_TYPE":
		case "WAND_TYPE":
		case "COLOR":
			answer = !isEmptyString(value);
			break;
		case "FREQUENCY_RANGE":
			answer = isDoubleRange(value);
			break;
		default:
			answer = false;
		}

		return answer;
	}

	static boolean isMatch(String value, String reg) {
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(value);
		return matcher.find();
	}

	static boolean isPositiveInteder(Object value) {
		return isMatch(value.toString(), "[1-9]\\d*");
	}

	static boolean isPositiveDouble(Object value) {
		return isMatch(value.toString(), "([1-9]\\d*\\.\\d+)|(0[1-9]*\\.\\d+)|(\\d\\.\\d+)|(0)|([1-9]\\d*)");
	}

	static boolean isEmptyString(Object value) {
		return value.toString().isEmpty();
	}

	static boolean isDoubleRange(Object value) {
		boolean answer = isMatch(value.toString(),
				"(([1-9]\\d*\\.\\d+)|(0[1-9]*\\.\\d+)|(\\d\\.\\d+)|(0)|([1-9]\\d*))-(([1-9]\\d*\\.\\d+)|(0[1-9]*\\.\\d+)|(\\d\\.\\d+)|(0)|([1-9]\\d*))<fv");
		if (answer) {
			String[] mas = value.toString().split("-");
			double n1 = Double.parseDouble(mas[0]);
			double n2 = Double.parseDouble(mas[1]);
			if (n2 <= n1) {
				answer = false;
			}
		}
		return answer;
	}

}

//you may add your own new classes