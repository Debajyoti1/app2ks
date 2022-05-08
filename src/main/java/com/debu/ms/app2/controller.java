package com.debu.ms.app2;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@Autowired
	private app1Proxy proxy;
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public HashMap<String, String> home() {
		app1Response app1resp=proxy.getApp1Response();
		HashMap<String,String> a=new HashMap<String,String>();
		a.put("app1type", app1resp.getType());
		a.put("app1ks-port", app1resp.getPort());
		a.put("app1ks-version", app1resp.getVersion());
		a.put("app1ks-hostname", app1resp.getHostname());
		a.put("newType", "app2");
		a.put("app2ks-port", env.getProperty("local.server.port"));
		a.put("app2ks-version", "v1");
		a.put("app2ks-hostname", env.getProperty("HOSTNAME"));
		return a;
	}
	@GetMapping("/test")
	public String another() {
		return "It works";
	}
	
	
	
}
