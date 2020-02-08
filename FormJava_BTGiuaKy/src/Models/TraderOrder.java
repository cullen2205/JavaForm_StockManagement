package Models;

import java.time.LocalDateTime;
import java.util.HashMap;

public class TraderOrder {
	public int codeTrader;
	public LocalDateTime timeOrder;
	public HashMap<Integer , Integer> buy, sell; ///code Stock, Number of stock
	
	
	
	private TraderOrder() {
		timeOrder = LocalDateTime.now();
	}
	
	public TraderOrder(int codeTrader) {
		this();
		this.codeTrader = codeTrader;
	}
}
