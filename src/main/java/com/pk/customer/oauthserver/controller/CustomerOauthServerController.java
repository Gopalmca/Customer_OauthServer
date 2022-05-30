package com.pk.customer.oauthserver.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerOauthServerController {

	@GetMapping("/user/me")
	public Principal user(Principal principal) {
		return principal;
	}
}
