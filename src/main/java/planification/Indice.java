package planification;

public class Indice {
	private int minObj;
	private int minPreference;
	
	public Indice(int minObj, int minPreference) {
		this.minObj = minObj;
		this.minPreference = minPreference;
	}
	public int getMinObj() {
		return minObj;
	}
	public void setMinObj(int minObj) {
		this.minObj = minObj;
	}
	public int getMinPreference() {
		return minPreference;
	}
	public void setMinPreference(int minPreference) {
		this.minPreference = minPreference;
	}

}
