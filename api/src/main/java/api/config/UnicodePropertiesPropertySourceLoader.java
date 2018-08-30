package api.config;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.springframework.boot.env.PropertySourceLoader;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UnicodePropertiesPropertySourceLoader implements PropertySourceLoader {

	@Override
	public String[] getFileExtensions() {
		log.info("getFileExtensions() called.");
		return new String[] { "properties" };
	}

	@Override
	public List<PropertySource<?>> load(String name, Resource resource) throws IOException {
		log.info("load() called.");
		Properties properties = new Properties();
		properties.load(new InputStreamReader(resource.getInputStream(), "UTF-8"));
		if (!properties.isEmpty()) {
			return Arrays.asList(new PropertiesPropertySource(name, properties));
		}
		return Arrays.asList();
	}

}
