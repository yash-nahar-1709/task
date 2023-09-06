package com.project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pro")
public class product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "productname")
    private String productname;
    
    public product()
    {
    	
    }

    public product(Long id, String productname, category category) {
		super();
		this.id = id;
		this.productname = productname;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return productname;
	}

	public void setName(String name) {
		this.productname = name;
	}



	public category getCategory() {
		return category;
	}

	public void setCategory(category category) {
		this.category = category;
	}

	
	@ManyToOne
    @JoinColumn(name = "category_id")
    private category category;

    
}

