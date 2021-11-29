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

import fr.zaragoza.Tripadvisor.model.Agency;
import fr.zaragoza.Tripadvisor.model.Hotel;
import fr.zaragoza.Tripadvisor.repositories.AgencyRepository;
import fr.zaragoza.Tripadvisor.repositories.HotelRepository;

@RestController
@RequestMapping("api/v1")
public class AgencyController {

	@Autowired
	public AgencyRepository agencyRepository;
	
	@Autowired
	public HotelRepository hotelRepository;

	// returns all agency
	@GetMapping("/agencies")
	public List<Agency> getAllHotels() {
		return agencyRepository.findAll();
	}

	// post new agency
	@PostMapping("/agencies")
	public Agency postHotel(@RequestBody Agency agency) {
		return agencyRepository.save(agency);
	}

	// update the agency entity (similar to the post)
	@PutMapping("/agencies")
	public void updateHotel(@RequestBody Agency agency) {
		agencyRepository.save(agency);
	}

	// get a specific agency based on the id
	@GetMapping("agencies/{id}")
	public Optional<Agency> getHotelFromId(@PathVariable Long id) {
		return agencyRepository.findById(id);
	}

	// delete an agency based on the id
	@DeleteMapping("/agencies/{id}")
	public void deleteHotel(@PathVariable Long id) {
		agencyRepository.deleteById(id);
	}

	// get a specific agency based on the id
	@GetMapping("agencies/{id}/hotels")
	public List<Hotel> getHotelFromAgencyId(@PathVariable Long id) {
		return hotelRepository.findByAgencyId(id);
	}

}
