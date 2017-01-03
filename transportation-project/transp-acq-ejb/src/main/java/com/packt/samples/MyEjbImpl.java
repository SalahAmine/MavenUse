package com.packt.samples;

import javax.ejb.Stateless;

@Stateless
public class MyEjbImpl implements MyEjb {
	@Override
	public int myMethod() {
		return 0;
	}
}