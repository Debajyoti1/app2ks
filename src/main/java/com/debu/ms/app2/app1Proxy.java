package com.debu.ms.app2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="app1ks")
@FeignClient(name="app1ks",url="${APP2KS_HOST:http://localhost}:8000")
public interface app1Proxy {
	@GetMapping("/")
	public app1Response getApp1Response();
}
