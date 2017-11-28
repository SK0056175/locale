package com.locale.demo.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.locale.demo.dto.ResponseDTO;

@RestController
@RequestMapping(value = "/")
public class MyController {
	@Autowired
	ResourceBundleMessageSource messageSource;

	@RequestMapping(value = "test", method = RequestMethod.POST)
	ResponseDTO test(@RequestParam String input) {
		Locale locale = new Locale(input);
		String message = messageSource.getMessage("api.success.message", null, locale);
		return new ResponseDTO(message);
	}
}
