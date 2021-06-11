package com.springboot.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class State {
@Id
	private int state_id;
	private String state_capital;
	private String state_name;
	private String state_cm;
	
	
	

	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public String getState_capital() {
		return state_capital;
	}
	public void setState_capital(String state_capital) {
		this.state_capital = state_capital;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getState_cm() {
		return state_cm;
	}
	public void setState_cm(String state_cm) {
		this.state_cm = state_cm;
	}
	
	@Override
	public String toString() {
		return "Alien [state_id=" + state_id + ", state_capital=" + state_capital + ", state_name=" + state_name + "]";
	}
	

}
