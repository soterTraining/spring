package hu.soter.bean_config_xml;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class UnderscoreNameFormatter implements Formatter {

	@Override
	public String format(String name) {
		return name.replaceAll("\\s+", "_");
	}
}
