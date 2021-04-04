package com.groupproj.marketsearch.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="dbproducts")
public class DBProduct {
//	Atributes >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(updatable=false)
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date createdAt;
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private Date updatedAt;
	@PrePersist
	protected void onCreate(){
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate(){
		this.updatedAt = new Date();
	}
	private String title;
	private Double basePrice;
	private Double bestPrice;
	private String barcode;
//	Table Realationships >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(
	    name = "wishlist", 
	    joinColumns = @JoinColumn(name = "dbproduct_id"), 
	    inverseJoinColumns = @JoinColumn(name = "user_id")
	)
	private List<User> usersWhoWant;
//	Constructors  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public DBProduct() {
		
	}
	public DBProduct(String title, Double basePrice, Double bestPrice, String barcode) {
		this.title = title;
		this.basePrice = basePrice;
		this.bestPrice = bestPrice;
		this.barcode = barcode;
	}
	//	Getter/Setter Pairs >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	public List<User> getUsersWhoWant() {
		return this.usersWhoWant;
	}
	public void setUsersWhoWant(List<User> user) {
		this.usersWhoWant = user;
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return this.createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return this.updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getBarcode() {
		return this.barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getBasePrice() {
		return this.basePrice;
	}
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	public Double getBestPrice() {
		return this.bestPrice;
	}
	public void setBestPrice(Double bestPrice) {
		this.bestPrice = bestPrice;
	}
	
}
