package com.antenas.antenas.controllers;

import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventoController {
	
	@RequestMapping("/cadastrarEvento")
	public String form() {
		return "evento/formEvento";
	}
	
	@RequestMapping(path = "/something", method = RequestMethod.POST)
	public void handle(@RequestBody String body, Writer writer) throws IOException {
	    writer.write(body);
	    System.out.println(body);
	}
}
