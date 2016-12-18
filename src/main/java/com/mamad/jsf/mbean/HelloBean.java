package com.mamad.jsf.mbean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String firstname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String f) {
		this.firstname = f;
	}
}