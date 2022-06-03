package phone;

import java.util.Random;

public class Applia extends Phone1 {
	String appliaType;
	
	public Applia(String cord, String appliaType,String address) {
		super(cord, address);
		this.appliaType = appliaType;
	}

	public String getAppliaType() {
		return appliaType;
	}

	public void setAppliaType(String appliaType) {
		this.appliaType = appliaType;
	}

	@Override
	public int price() {
		int disc = 0;
		int total = 0;
		Random rand = new Random();
		if(appliaType.equals("Original")) {
			disc = rand.nextInt(1000000);
			total = 17000000 - disc;
		} else if(appliaType.equals("Pro")) {
			disc = rand.nextInt(2000000);
			total = 17000000 - disc;
		} else if(appliaType.equals("Promax")) {
			disc = rand.nextInt(2500000);
			total = 17000000 - disc;
		}
		return total; 
		
		
	}

}
