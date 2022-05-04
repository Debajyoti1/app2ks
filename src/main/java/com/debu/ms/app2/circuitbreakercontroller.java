package com.debu.ms.app2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class circuitbreakercontroller {
	
	@GetMapping("/sample")
	//@Retry(name="myretry", fallbackMethod = "erfunc")
	//@CircuitBreaker(name="default", fallbackMethod = "erfunc")
	@RateLimiter(name="default")
	public String sample() {
		/*ResponseEntity<String> re=new RestTemplate()
				.getForEntity("http://localhost:8000", String.class);
		
		return re.getBody();
		*/
		return "Hi";
	}
	public String erfunc(Exception e) {
		return "Fallback response "+e.getMessage();
	}
}
