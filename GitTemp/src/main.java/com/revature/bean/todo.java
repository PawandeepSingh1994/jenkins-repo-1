package com.revature.bean;

import java.io.Serializable;

public class todo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer priority;
	
	public todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public todo(String name, int priority) {
		super();
		this.name = name;
		this.priority = priority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	@Override
	public String toString() {
		return "todo [name=" + name + ", priority=" + priority + "]";
	}
	
	}
