package com.newmark.RedirectFromHttpToHttps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsController {

	@GetMapping("/message")
	public String getHttpsMethod() {

		return "Redirected from http to https";
	}
}
