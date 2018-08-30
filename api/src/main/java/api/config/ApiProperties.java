package api.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

/**
 * Properties provided by API.
 *
 * @author sahara3
 *
 */
@ConfigurationProperties(prefix = "api")
@Data
public class ApiProperties {
	private String message;
}
