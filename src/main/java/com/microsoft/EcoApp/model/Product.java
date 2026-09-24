
package com.microsoft.EcoApp.model;

import java.math.BigDecimal;
import java.sql.Date;

//import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor 
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer prodId;
	private String name;
	private String brand;
	private String description;
	private BigDecimal price;
	private String category;
	
	//@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	private Date releaseDate;
	
	private Boolean productAvailable;
	private int stockQuantity;
	
	private String imageaName;
	private String imageType;
	@Lob
	private byte[] imageDate;
}
