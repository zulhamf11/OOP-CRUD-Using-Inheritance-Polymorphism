package phone;

public abstract class Phone1 {

	private String cord;
	private String Address;

	
	public Phone1(String cord, String address) {
		super();
		this.cord = cord;
		Address = address;
		
	}

	public String getCord() {
		return cord;
	}

	public void setCord(String cord) {
		this.cord = cord;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	public abstract int price();
	 

}
