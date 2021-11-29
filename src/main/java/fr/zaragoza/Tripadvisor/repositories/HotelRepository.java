package fr.zaragoza.Tripadvisor.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.zaragoza.Tripadvisor.model.Hotel;

public interface HotelRepository 
extends JpaRepository<Hotel,Long>{
	
	// Select * from Hotel where id="x"
	Optional<Hotel> findById(Long id);
	
	// select * from Hotel
	List<Hotel> findAll(); 
}
