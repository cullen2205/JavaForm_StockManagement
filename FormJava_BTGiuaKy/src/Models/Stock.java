package Models;

import java.util.PriorityQueue;

public class Stock {
	public int code;
	public int codeOwnerTrader;
	public PriorityQueue<TraderOrder> buy, sell;
	
	public static int codeStatic = 0;
	
	
	
	
	private Stock() {
		buy = new PriorityQueue<TraderOrder>();
		sell = new PriorityQueue<TraderOrder>();
		
		++code;
	}
	
	public Stock(int code, int codeOwnerTrader) {
		this();
		this.code = code;
		this.codeOwnerTrader = codeOwnerTrader;
	}
}
