package com.debu.ms.app2;

public class app1Response {
	private String type;
	private String port;
	private String version;
	private String hostname;
	public app1Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public app1Response(String type, String port, String version, String hostname) {
		super();
		this.type = type;
		this.port = port;
		this.version = version;
		this.hostname = hostname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	@Override
	public String toString() {
		return "app1Response [type=" + type + ", port=" + port + ", version=" + version + ", hostname=" + hostname
				+ "]";
	}
	
	
	
}
