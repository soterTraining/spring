package hu.soter.bean_config_java;

public class HashmarkNameFormatter implements Formatter {

	@Override
	public String format(String name) {
		return name.replaceAll("\\s+", "#");
	}
}
