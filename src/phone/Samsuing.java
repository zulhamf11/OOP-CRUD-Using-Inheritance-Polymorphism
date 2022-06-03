package phone;

import java.util.Random;

public class Samsuing extends Phone1 {
	String samsuingType;
	public Samsuing(String cord, String samsuingType,String address) {
		super(cord, address);
		this.samsuingType = samsuingType;
	}
	
	public String getSamsuingType() {
		return samsuingType;
	}

	public void setSamsuingType(String samsuingType) {
		this.samsuingType = samsuingType;
	}

	@Override
	public int price() {
		int disc = 0;
		int total = 0;
		Random rand = new Random();
		if(samsuingType.equals("Alries")) {
			disc = rand.nextInt(500000);
			total = 17000000 - disc;
		} else if(samsuingType.equals("Saries")) {
			disc = rand.nextInt(750000);
			total = 17000000 - disc;
		} else if(samsuingType.equals("Xseries")) {
			disc = rand.nextInt(1000000);
			total = 17000000 - disc;
		}
		return total;
	}

	
	
	

}
