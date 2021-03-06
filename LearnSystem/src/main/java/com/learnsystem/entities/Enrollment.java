package com.learnsystem.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Enrollment implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();

	private Instant enrollmentMoment;
	private boolean available;
	private boolean onylUpdate;

	public Enrollment() {
	}

	public Enrollment(User user, Offer offer, Instant enrollmentMoment, boolean available, boolean onylUpdate) {
		this.id.setUser(user);
		this.id.setOffer(offer);
		this.enrollmentMoment = enrollmentMoment;
		this.available = available;
		this.onylUpdate = onylUpdate;
	}

	public EnrollmentPK getId() {
		return id;
	}

	public void setId(EnrollmentPK id) {
		this.id = id;
	}

	public Instant getEnrollmentMoment() {
		return enrollmentMoment;
	}

	public void setEnrollmentMoment(Instant enrollmentMoment) {
		this.enrollmentMoment = enrollmentMoment;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public boolean isOnylUpdate() {
		return onylUpdate;
	}

	public void setOnylUpdate(boolean onylUpdate) {
		this.onylUpdate = onylUpdate;
	}

	
}
