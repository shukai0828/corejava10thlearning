package me.shuke.enums;

public enum Size {
	SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
	
	private Size(String abbre) {
		this.abbre = abbre;
	}
	
	public String getAbbre() {
		return this.abbre;
	}
	private String abbre;
}
