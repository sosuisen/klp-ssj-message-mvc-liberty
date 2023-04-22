package com.example.model;

import jakarta.ws.rs.FormParam;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class MessageDTO {
	@FormParam("message")
	private String message;
	@FormParam("name")
	private String name;
}