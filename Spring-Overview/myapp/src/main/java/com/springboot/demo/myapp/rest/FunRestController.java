package com.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	//inject properties for: coach.name and team.name

	@Value("${coach.name}")
	private String coachName;

	@Value("${team.name}")
	private String teamName;

	//Expose new endpoints for "teamInfo"
	@GetMapping("/teaminfo")
	public String teamInfo(){
		return "Coach: "+coachName+", TeamName:	"+ teamName;
	}

	// expose "/" that return "Hello World"
	@GetMapping("/")
	public String sayHello() {
		return "Hello World";
	}

	@GetMapping("/workout")
	public String getDailyWorkout(){
		return "Run a hard 5K";
	}

}
