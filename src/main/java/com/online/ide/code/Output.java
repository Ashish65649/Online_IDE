package com.online.ide.code;

public class Output {

	private String output ;
	private String statusCode ;
	private String memory ;
	private String cpuTime ;
	
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getMemory() {
		return memory;
	}
	public void setMemory(String memory) {
		this.memory = memory;
	}
	public String getCpuTime() {
		return cpuTime;
	}
	public void setCpuTime(String cpuTime) {
		this.cpuTime = cpuTime;
	}
	
	@Override
	public String toString() {
		return "Output [output=" + output + ", statusCode=" + statusCode + ", memory=" + memory + ", cpuTime=" + cpuTime
				+ "]";
	}
}
