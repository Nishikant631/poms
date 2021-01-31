package com.nt.service;

public class BankService {

	public float calSimpleIntrestAmount(float pAmnt,float rate, float time) {
		return pAmnt*rate*time/100.0f;
	}
}
