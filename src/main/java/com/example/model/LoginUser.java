package com.example.model;

import java.io.Serializable;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Setter;

@Setter
@Named
@SessionScoped
public class LoginUser implements Serializable {
	private String name = null;
}

