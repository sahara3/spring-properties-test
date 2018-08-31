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
@SuppressWarnings("static-method")
public class ApiAutoConfiguration {

	/**
	 *
	 * @return UnicodeIniPropertySourceLoader bean.
	 */
	@Bean
	public UnicodeIniPropertySourceLoader unicodeIniPropertySourceLoader() {
		return new UnicodeIniPropertySourceLoader();
	}
}
