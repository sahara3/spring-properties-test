package api;

import org.springframework.beans.factory.annotation.Autowired;

import api.config.ApiProperties;

/**
 * Sample API using {@link ApiProperties}.
 *
 * @author sahara3
 *
 */
public class Messanger {
	@Autowired
	private ApiProperties properties;

	public String getMessage() {
		return this.properties.getMessage();
	}
}
