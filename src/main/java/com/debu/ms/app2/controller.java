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
		a.put("type", app1resp.getType());
		a.put("port", app1resp.getPort());
		a.put("version", app1resp.getVersion());
		a.put("hostname", app1resp.getHostname());
		a.put("newType", "app2");
		a.put("newport", env.getProperty("local.server.port"));
		a.put("newversion", "v1");
		a.put("newhostname", env.getProperty("HOSTNAME"));
		return a;
	}
	@GetMapping("/test")
	public String another() {
		return "It works";
	}
	
	
	
}
