package com.crimsonlogic.groceriessubbookingsystem.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payment_info")
@Data
@NoArgsConstructor
public class Payments {
	
	@Id
	@GeneratedValue(generator = "custom-prefix-generator")
    @GenericGenerator(name = "custom-prefix-generator",
    	strategy = "com.crimsonlogic.groceriessubbookingsystem.util.CustomPrefixIdentifierGenerator",
    	parameters = @org.hibernate.annotations.Parameter(name = "prefix", value = "TX")
    )
	private  String payment_id;
	private  float amount;
	private LocalDate payment_date;
	private String payment_mode;
	private long card_number;
	private String expire_date;
	private int cvv_number;
	private String transaction_id;
	
	 @OneToOne
	    @JoinColumn(name = "order_id")
	    private Order order;

}
