package com.openwebinars.springboot;

import java.nio.charset.Charset;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class MyRestClientController {

	final String urlUserHello = "http://localhost:9000/api/hello";
	final String urlAdminHello = "http://localhost:9000/api/admin/hello";

	@GetMapping("/")
	public String userHello(Model model) {

		RestTemplate restTemplate = new RestTemplate();

		//ResponseEntity<?> response = restTemplate.getForEntity(urlUserHello, String.class);
		
		ResponseEntity<?> response = restTemplate.exchange(urlUserHello, HttpMethod.GET,
				new HttpEntity<String>(createHeaders("luismi", "lopez")), String.class);
		
		model.addAttribute("saludo", response.getBody());

		return "userhello";

	}

	@GetMapping("/admin")
	public String adminHello(Model model) {

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<?> response = restTemplate.exchange(urlAdminHello, HttpMethod.GET,
				new HttpEntity<String>(createHeaders("admin", "admin")), String.class);
		
		model.addAttribute("saludo", response.getBody());
		
		
		return "adminhello";
	}

	@SuppressWarnings("serial")
	private HttpHeaders createHeaders(String username, String password) {
		return new HttpHeaders() {
			{
				String auth = username + ":" + password;
				byte[] encodedAuth = Base64.
						encodeBase64(auth.getBytes(Charset.forName("UTF-8")));
				String authHeader = "Basic " + new String(encodedAuth);
				set("Authorization", authHeader);
			}
		};
	}

	
}
