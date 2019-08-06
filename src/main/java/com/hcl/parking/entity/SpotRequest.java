package com.hcl.parking.entity;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SpotRequest implements Serializable{/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userId;
	private LocalDate fromDate;
	private LocalDate toDate;
	

}
