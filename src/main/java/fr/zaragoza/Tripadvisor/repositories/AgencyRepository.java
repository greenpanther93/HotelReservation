package fr.zaragoza.Tripadvisor.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.zaragoza.Tripadvisor.model.Agency;
import fr.zaragoza.Tripadvisor.model.Hotel;

public interface AgencyRepository extends JpaRepository<Agency,Long> {
	
	// Select * from Hotel where id="x"
	Optional<Agency> findById(Long id);
	
	// select * from Hotel
	List<Agency> findAll(); 
	
	public Agency save(Agency hotel);
	
	//@Query("FROM Agency AS agency LEFT JOIN rdt.hotel AS hotel WHERE agency.id = ?1")    //This is using a named query method
	//public List<Hotel> FindAllHotelWithAgencyId(Integer id);
}
