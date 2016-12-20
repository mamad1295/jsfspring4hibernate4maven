package com.mamad.jsf.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="mainController", eager=true)
@RequestScoped
public class MainController implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
		public String moveToWelcome(){
			return "welcome";
		}
		
		public String moveToListUsers(){
			return "listUsers";
		}

}
