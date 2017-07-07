package model;

/** @pdOid d2e63b93-6e59-4754-930c-763e64584923 */
public class StatistikaTrenera {
	/** @pdOid f0de1e87-7197-48b7-baea-8c3a617e8bd4 */
	private int tehnicke;

	public StatistikaTrenera() {
	}

	public StatistikaTrenera(int tehnicke) {
		this();
		this.tehnicke = tehnicke;
	}

	public int getTehnicke() {
		return tehnicke;
	}

	public void setTehnicke(int tehnicke) {
		this.tehnicke = tehnicke;
	}

}