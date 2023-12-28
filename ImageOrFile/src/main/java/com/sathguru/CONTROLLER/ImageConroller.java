package com.sathguru.CONTROLLER;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sathguru.SERVICE.ImageService;

@RestController
public class ImageConroller {

	@Autowired
	ImageService imageService;

	@ResponseStatus(value = HttpStatus.OK)
	@PostMapping("/save")
	public String saveImage(@RequestParam("file") MultipartFile file, @RequestParam("name") String name,
			@RequestParam("description") String description) throws IOException {

		return imageService.saveImage(file, name, description);

	}
}