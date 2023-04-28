package edu.nobreza;

import java.util.List;

public class Conselheiro {
	private List <Bispo> bispos;
	
	public Conselheiro(List<Bispo> bispos) {
		this.bispos = bispos;
	}
	
	public List<Bispo> getBispos(){
		return bispos;
	}
}
