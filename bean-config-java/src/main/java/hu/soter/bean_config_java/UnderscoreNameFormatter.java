package hu.soter.bean_config_java;

public class UnderscoreNameFormatter implements Formatter {

	@Override
	public String format(String name) {
		return name.replaceAll("\\s+", "_");
	}
}
