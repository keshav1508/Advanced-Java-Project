package net.compa5.app1;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
public class Address {

	@Id @GeneratedValue
	private int addressid;
	
	@Column (name="Street")
	private String Streetname;
	
	@Column (length=6)
	private String pincode;
	
	@Transient
	private String Landmark;
	private boolean permenant;
	
	@Temporal (TemporalType.DATE)
	private Date address_gen_date;
	
	
	public Address(Date address_gen_date) {
		super();
		this.address_gen_date = address_gen_date;
	}






	public Date getAddress_gen_date() {
		return address_gen_date;
	}






	public void setAddress_gen_date(Date address_gen_date) {
		this.address_gen_date = address_gen_date;
	}






	public Address(boolean permenant) {
		super();
		this.permenant = permenant;
	}
	





	public boolean isPermenant() {
		return permenant;
	}
	public void setPermenant(boolean permenant) {
		this.permenant = permenant;
	}
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getStreetname() {
		return Streetname;
	}
	public void setStreetname(String streetname) {
		Streetname = streetname;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return Landmark;
	}
	public void setLandmark(String landmark) {
		Landmark = landmark;
	}


	public Address(int addressid, String streetname, String pincode, String landmark, String permenant, String date) {
		super();
		this.addressid = addressid;
		Streetname = streetname;
		this.pincode = pincode;
		Landmark = landmark;
		
		
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
