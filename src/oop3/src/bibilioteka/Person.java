package oop3.src.bibilioteka;

public abstract class Person {
	private String emer;
	private String mbiemer;

	public Person() {

	}

	public Person(String emer, String mbiemer) {
		super();
		this.emer = emer;
		this.mbiemer = mbiemer;
	}


	public String getEmer() {
		return emer;
	}

	public void setEmer(String emer) {
		this.emer = emer;
	}

	public String getMbiemer() {
		return mbiemer;
	}

	public void setMbiemer(String mbiemer) {
		this.mbiemer = mbiemer;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			return false;
		}
		if (obj == null) {
			return false;
		}

		Person personObj = (Person) obj;

		if (this.mbiemer.equalsIgnoreCase(personObj.getMbiemer())) {
			return true;
		}
		return false;
	}*/

	public String toString() {
		return emer + " " + mbiemer;
	}
}
