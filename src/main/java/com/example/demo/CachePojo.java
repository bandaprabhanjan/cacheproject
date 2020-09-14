package com.example.demo;

public class CachePojo {

	private String controlNumber;
	private String indicator;

	public CachePojo(String controlNumber, String indicator) {
		super();
		this.controlNumber = controlNumber;
		this.indicator = indicator;
	}

	public String getControlNumber() {
		return controlNumber;
	}

	public void setControlNumber(String controlNumber) {
		this.controlNumber = controlNumber;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

}
