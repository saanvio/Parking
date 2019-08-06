package com.hcl.parking.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AllocatedSpot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long allocatedSpotId;
	private Long days;
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	@OneToOne
	@JoinColumn(name = "spot_id")
	private SpotOwner spot;
//	private Long userId;
//	private Long spotId;

}
