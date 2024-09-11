package com.crimsonlogic.groceriessubbookingsystem.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="users_info")
@Data
@NoArgsConstructor
public class Users {
	
	@Id
	@GeneratedValue(generator = "custom-prefix-generator")
    @GenericGenerator(name = "custom-prefix-generator",
    	strategy = "com.crimsonlogic.groceriessubbookingsystem.util.CustomPrefixIdentifierGenerator",
    	parameters = @org.hibernate.annotations.Parameter(name = "prefix", value = "CUS")
    )
	private  String user_id;
	
	@Column(name="user_name")
	private String user_Name;
	
	@Column(name="user_role")
	private String userRole;
	
	@Column(name="user_email")
    private String userEmail;
	
	@Column(name="user_password")
    private String userPassword;
	
	@Column(name="user_mobile_number")
    private String userMobileNumber;
	
	@OneToMany(mappedBy="users")
	private List<Order> orders;

	
}
