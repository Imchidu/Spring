package com.xworkz.mobileEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "mobiledetails")

@NamedQuery(name ="findByBrand",query = "select entity  from MobileEntity entity where entity.brand=:br")
public class MobileEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String brand;
	private String color;
	private int price;
	private String type;

	public MobileEntity() {
		System.out.println(" default constructor of dto");
	}

	public MobileEntity(String brand, String color, int price, String type) {
		super();

		this.brand = brand;
		this.color = color;
		this.price = price;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "MobileEntity [id=" + id + ", brand=" + brand + ", color=" + color + ", price=" + price + ", type="
				+ type + "]";
	}

}
