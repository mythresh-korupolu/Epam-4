package com.klu.Epam_3;

public class CompoundInterest {
	public static final float CI=0;
	public CompoundInterest(float p,float r,float n) {
		double CI=Math.pow(p*(1+(r/100)),n);
		System.out.format("%.2f",CI);
	}

}
