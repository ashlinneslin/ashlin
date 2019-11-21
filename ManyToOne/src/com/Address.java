package com;  
  
import javax.persistence.*;  
  
@Entity  
@Table(name="tbl_address")  
public class Address {  
    @Id  
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="addr_seq")
    @SequenceGenerator(
    					name="addr_seq",
    					sequenceName="TBL_ADDRESS_SEQ",allocationSize=1
    		) 
    private int a_id; 
    
    
    private String a_city,a_country;
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getA_city() {
		return a_city;
	}
	public void setA_city(String a_city) {
		this.a_city = a_city;
	}
	public String getA_country() {
		return a_country;
	}
	public void setA_country(String a_country) {
		this.a_country = a_country;
	}        
   
    
}  