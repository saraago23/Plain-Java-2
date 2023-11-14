package oop3.src.bibilioteka;

import java.time.LocalDate;
import java.util.Objects;

public class Autor extends Person {

	private LocalDate datelindje;

	public Autor(String emer, String mbiemer) {
		super(emer, mbiemer);
	}

	public LocalDate getDatelindje() {
		return datelindje;
	}

	public void setDatelindje(LocalDate datelindje) {
		this.datelindje = datelindje;
	}



}
