package fr.zaragoza.Tripadvisor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
	private Long id;

	@Column(name = "name")
	private String name;
	@Column(name = "stars")
	private int stars;
	@Column(name = "description")
	private String description;
	
	public Hotel() {
		
	}
	
	public Hotel(Long id, String name, int stars, String description) {
		super();
		this.id = id;
		this.name = name;
		this.stars = stars;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
