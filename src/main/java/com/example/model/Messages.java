package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class Messages extends ArrayList<MessageDTO> implements Serializable {

}
