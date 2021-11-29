package fr.zaragoza.Tripadvisor.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.zaragoza.Tripadvisor.model.Hotel;
import fr.zaragoza.Tripadvisor.repositories.HotelRepository;

@RestController
@RequestMapping("api/v1")
public class HotelController {

	@Autowired
	public HotelRepository hotelRepository;

	// returns all hotels
	@GetMapping("/hotels")
	public List<Hotel> getAllHotels() {
		return hotelRepository.findAll();
	}

	// post new hotel
	@PostMapping("/hotels")
	public Hotel postHotel(@RequestBody Hotel hotel) {
		return hotelRepository.save(hotel);
	}
	
	// update the hotel entity (similar to the post)
	@PutMapping("/hotels")
	public void updateHotel(@RequestBody Hotel hotel) {
		hotelRepository.save(hotel);
	}
	
	// get a specific hotel based on the id
	@GetMapping("hotels/{id}")
	public Optional<Hotel> getHotelFromId(@PathVariable Long id) {
		return hotelRepository.findById(id);
	}
	
	// delete a hotel based on the id
	@DeleteMapping("/hotels/{id}")
	public void deleteHotel(@PathVariable Long id) {
		hotelRepository.deleteById(id);
	}
	
	@GetMapping("/hello")
	public String sayHelloWorld() {
		return "Hello World!";
	}

	@GetMapping("/hotelTest")
	public Hotel baseHotel() {
		return new Hotel((long) 123, "BasicHotel", 4, "This is a 4 star hotel.");
	}

}
