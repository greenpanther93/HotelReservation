package fr.zaragoza.Tripadvisor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.zaragoza.Tripadvisor.model.Hotel;
import fr.zaragoza.Tripadvisor.repositories.HotelRepository;

@RestController
@RequestMapping("api/v1")
public class HotelController {
	
	@Autowired
	public HotelRepository hotelRepository;

	@GetMapping("/hotel")
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll(); 
	}
	
	@GetMapping("/hello")
	public String sayHelloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/hotelTest")
	public Hotel baseHotel() {
		return new Hotel((long) 123, "BasicHotel", 
				4, "This is a 4 star hotel.");
	}

}
