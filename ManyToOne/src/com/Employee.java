package com;  
import javax.persistence.*;  
  
@Entity  
@Table(name="tbl_worker")  
public class Employee {    
     @Id  
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="emp_seq")
     @SequenceGenerator(
     					name="emp_seq",
     					sequenceName="TBL_WORKER_SEQ",allocationSize=1
     		)
     private int w_id;
     
     @ManyToOne(cascade=CascadeType.ALL) 
     @JoinColumn(name="w_addressid")
     private Address address;
     
     private String w_name;

	public int getW_id() {
		return w_id;
	}

	public void setW_id(int w_id) {
		this.w_id = w_id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getW_name() {
		return w_name;
	}

	public void setW_name(String w_name) {
		this.w_name = w_name;
	}
     



}  