package Models;

import java.util.HashMap;

public class Trader {
	public int code; // = identity card
	public String name;
	public String nameCompany;
	public int money;
	
	public LoginInfo logininfo;
	
	public HashMap<Integer, Integer> ownerStock;// code stock, number of stock
	
	
	
	private Trader() {
		ownerStock = new HashMap<Integer, Integer>();
		logininfo = new LoginInfo();
	}
}
