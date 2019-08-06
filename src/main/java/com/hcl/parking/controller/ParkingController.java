package com.hcl.parking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking")
public class ParkingController {

	@GetMapping("/hello")
	public String getHello() {
		return "hello";
	}

}
