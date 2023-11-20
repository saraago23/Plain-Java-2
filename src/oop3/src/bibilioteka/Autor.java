package oop3.src.bibilioteka;

import java.time.LocalDate;
import java.util.Objects;

public class Autor extends Person {
	private int id;
	private static int counter = 0;


	private LocalDate datelindje;

	public Autor(String emer, String mbiemer) {
		super(emer, mbiemer);
		this.id = counter++;
	}


	public LocalDate getDatelindje() {
		return datelindje;
	}

	public void setDatelindje(LocalDate datelindje) {
		this.datelindje = datelindje;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Autor autor = (Autor) o;
		return Objects.equals(getEmer(), autor.getEmer()) &&
				Objects.equals(getMbiemer(), autor.getMbiemer());


	}

	@Override
	public int hashCode() {
		return Objects.hash(getEmer(), getMbiemer());
	}
}