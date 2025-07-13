package com.tka.SpringMVCEx;

public class Classroom {
	
	private int clsid;
	private String clsname;
	
	public Classroom() {
		super();
	}
	@Override
	public String toString() {
		return "Classroom [clsid=" + clsid + ", clsname=" + clsname + "]";
	}
	public int getClsid() {
		return clsid;
	}
	public void setClsid(int clsid) {
		this.clsid = clsid;
	}
	public String getClsname() {
		return clsname;
	}
	public void setClsname(String clsname) {
		this.clsname = clsname;
	}
	
	
	
}
