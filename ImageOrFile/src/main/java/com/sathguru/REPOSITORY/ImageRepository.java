package com.sathguru.REPOSITORY;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathguru.DTO.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
	
	Optional<Image> findByName(String fileName);

}
