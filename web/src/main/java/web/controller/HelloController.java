package web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.config.ApiProperties;
import lombok.RequiredArgsConstructor;
import web.config.WebProperties;

/**
 * Sample REST API controller using API and Web properties.
 *
 * @author sahara3
 *
 */
@RestController
@RequiredArgsConstructor
public class HelloController {

	@NotNull
	private final ApiProperties apiProperties;

	@NotNull
	private final WebProperties webProperties;

	@RequestMapping("/")
	public Map<String, String> hello() {
		Map<String, String> map = new HashMap<>();
		map.put("apiMessage", this.apiProperties.getMessage());
		map.put("webMessage", this.webProperties.getMessage());
		return map;
	}
}
