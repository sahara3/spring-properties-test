package api.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * Auto configuration of API.
 *
 * @author sahara3
 *
 */
@EnableConfigurationProperties(ApiProperties.class)
public class ApiAutoConfiguration {

	@Bean
	public UnicodePropertiesPropertySourceLoader unicodePropertiesPropertySourceLoader() {
		return new UnicodePropertiesPropertySourceLoader();
	}
}
