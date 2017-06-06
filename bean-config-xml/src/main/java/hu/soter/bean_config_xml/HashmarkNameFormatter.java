package hu.soter.bean_config_xml;

import org.springframework.stereotype.Component;

@Component("hashmark")
public class HashmarkNameFormatter implements Formatter {

	@Override
	public String format(String name) {
		return name.replaceAll("\\s+", "#");
	}
}
