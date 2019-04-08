package com.client;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/clients", method=RequestMethod.GET)
public class ClientController {
	
	@RequestMapping("/operation")
	public String getDetail() {
		RestTemplate   restTemplate = new RestTemplate();
		try {
			return restTemplate.getForObject(new URI("http://localhost:8082/servers/details"), String.class);
		} catch (RestClientException e) {
			System.out.println(e);
		} catch (URISyntaxException e) {
			System.out.println(e);
		}
		return null;
	}
}
