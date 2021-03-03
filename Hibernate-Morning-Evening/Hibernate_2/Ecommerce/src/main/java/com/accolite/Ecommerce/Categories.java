package com.accolite.Ecommerce;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="Category")
public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Id")
	private int id;
	@Column(name="CategoryName")
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "Id")
	private Product product;
	
	@ManyToMany(targetEntity = Supplier.class, cascade = CascadeType.ALL)
	@JoinTable(name = "Category_Supplier", 
	joinColumns = @JoinColumn(referencedColumnName = "Id"), 
	inverseJoinColumns = @JoinColumn(referencedColumnName = "Id"))
	private Set<Supplier> supplier;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Set<Supplier> getSupplier() {
		return supplier;
	}

	public void setSupplier(Set<Supplier> supplier) {
		this.supplier = supplier;
	}
	
	


}
