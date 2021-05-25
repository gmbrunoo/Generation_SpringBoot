package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

	@GetMapping("/hello")
	public String sayHello(){
		return "<h1 style='    height: 100vh;\r\n"
				+ "    display: flex;\r\n"
				+ "    align-items: center;\r\n"
				+ "    justify-content: center; "
				+ "    font-size: 3rem;\r\n"
				+ "    font-family: monospace;\r\n"
				+ "    background: #000;\r\n"
				+ "    color: #fff;"
				+ "    margin: 0;'>Hello, World!_</h1>";
		
	}
	@GetMapping("/mentalidades")
	public String sayMentalities(){
		return 	"<h1>As mentalidades de hoje são: </h1>" +
				"<ol><li>Atenção aos detalhes;</li> " +
				"<li>Orientação ao futuro;</li> " +
				"<li>Persistencia.</li></ol>";
	}
	
	@GetMapping("/objetivos")
	public String sayGoals(){
		return 	"<h1>Os objetivos para essa semana: </h1>" +
				"<ol><li>Aprender Spring Boot;</li>" +
				"<li>Conhecer um pouquinho mais sobre o backend JAVA. </li></ol>";
	}
	
	
}
