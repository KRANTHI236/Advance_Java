package com.sathguru.SERVICE;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.sathguru.DTO.Image;
import com.sathguru.REPOSITORY.ImageRepository;

@Service
public class ImageService {

	@Autowired
	ImageRepository imageRepository;

	public String saveImage(MultipartFile file, String name, String description) throws IOException {

		Image image1 = new Image();

		image1.setName(name);
		image1.setDescription(description);
		image1.setImage(file.getBytes());

		imageRepository.save(image1);

		return "image inserted into db";

	}

}
