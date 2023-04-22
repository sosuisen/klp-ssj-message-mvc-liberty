package com.example;

import com.example.model.LoginUser;
import com.example.model.MessageDTO;
import com.example.model.Messages;

import jakarta.inject.Inject;
import jakarta.mvc.Controller;
import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Controller
@Path("")
public class MyController {
	@Inject
	private Messages messages;

	@Inject
	private LoginUser loginUser;

	@GET
	@Path("")
	public String home() {
		return "index.jsp";
	}

	@GET
	@Path("list")
	public String getMessage() {
		loginUser.setName("京都コンピュータ学院");
		return "list.jsp";
	}

	@POST
	@Path("list")
	public String postMessage2(@BeanParam MessageDTO mes) {
		messages.add(mes);
		return "list.jsp";
	}

	@GET
	@Path("clear")
	public String clearMessage() {
		messages.clear();
		// リダイレクト
		return "redirect:list";
	}

}
