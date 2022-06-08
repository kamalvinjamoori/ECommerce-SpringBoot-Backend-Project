package com.masai.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import javax.validation.constraints.Size;

>>>>>>> main
=======
import javax.validation.constraints.Size;

>>>>>>> main
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;

	@NotNull
	@Size(min = 3, max = 30, message = "Product name size should be between 3-30")
	private String productName;

	@NotNull
	@DecimalMin(value = "0.00")
	private Double price;

	private String description;

	@NotNull
	private String manufacturer;

	@NotNull
	@Min(value = 1)
	private Integer quantity;

	@Enumerated(EnumType.STRING)
	private CategoryEnum category;

	@Enumerated(EnumType.STRING)
	private ProductStatus status;

//	@ManyToMany(cascade = CascadeType.ALL)
//	private Order order;

	@ManyToOne(cascade = CascadeType.ALL)
	private Seller seller;

//	@ManyToOne(cascade = CascadeType.ALL)
//	private Cart cart;
<<<<<<< HEAD
<<<<<<< HEAD
	@ManyToOne(cascade = CascadeType.ALL)
	private CategoryEnum category;
//	@ManyToMany(cascade = CascadeType.ALL)
//	private Order order;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonIgnore
	private Seller seller;
	
	
=======
>>>>>>> main
=======
>>>>>>> main

}
