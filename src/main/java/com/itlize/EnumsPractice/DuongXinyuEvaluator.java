package com.itlize.EnumsPractice;

public class DuongXinyuEvaluator{
	
	//Duong("Duong"), Xinyu("Xinyu");
	
	private String name;
	
	DuongXinyuEvaluator (String name) {
		this.name = name;
	}
		
	boolean isDuong() {
		if ( this.name.equals("Duong")) return true;
		return false;
	}
	
	boolean isXinyu() {
		if ( this.name.equals("xinyu")) return true;
		return false;
	}

	
}
