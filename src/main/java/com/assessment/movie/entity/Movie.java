package com.assessment.movie.entity;

import javax.persistence.*;


@Entity
@Table(name = "movie")
public class Movie {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
    private Long id;

	@Column(name = "title")
    private String title;

	@Column(name = "category")
    private String category;
    
	@Column(name = "rating")
    private String rating;

    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
    
}
