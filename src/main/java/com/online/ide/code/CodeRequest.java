package com.online.ide.code;

public class CodeRequest {

	private String script ;
	private String language ;
	private String versionIndex ;
	private String stdin ;
	
	public String getStdin() {
		return stdin;
	}

	public void setStdin(String stdin) {
		this.stdin = stdin;
	}

	public CodeRequest() {
	}
	
	public String getScript() {
		return script;
	}
	
	public void setScript(String script) {
		this.script = script;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getVersionIndex() {
		return versionIndex;
	}
	
	public void setVersionIndex(String versionIndex) {
		this.versionIndex = versionIndex;
	}
	
	@Override
	public String toString() {
		return "CodeRequest [script=" + script + ", language=" + language + ", versionIndex=" + versionIndex
				+ ", stdin=" + stdin + "]";
	}
}