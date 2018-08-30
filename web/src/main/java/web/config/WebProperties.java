package web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * Properties provided by Web.
 *
 * @author sahara3
 *
 */
@Configuration
@ConfigurationProperties(prefix = "api")
@Data
public class WebProperties {
	private String message;
}
