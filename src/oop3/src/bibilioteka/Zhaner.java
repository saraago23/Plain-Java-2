package oop3.src.bibilioteka;

public enum Zhaner {

	ROMAN("Roman"), FILOZOFI("Filozofi"), BIOGRAFI("Biografi"), HISTORI("Histori"),
	PSIKOLOGJI("Psikologji");

	private final String titulli;

	Zhaner(String titulli) {
		this.titulli = titulli;

	}

	public String getTitulli() {
		return titulli;
	}


}
