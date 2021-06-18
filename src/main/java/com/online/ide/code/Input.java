package com.online.ide.code;

public class Input {

	private String clientId ; 
	private String clientSecret ;
	private String language ;
	private String script ; 
	private String versionIndex ;
	private String stdin ;
	
	public String getStdin() {
		return stdin;
	}
	public void setStdin(String stdin) {
		this.stdin = stdin;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientSecret() {
		return clientSecret;
	}
	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	public String getVersionIndex() {
		return versionIndex;
	}
	public void setVersionIndex(String versionIndex) {
		this.versionIndex = versionIndex;
	}	
}
