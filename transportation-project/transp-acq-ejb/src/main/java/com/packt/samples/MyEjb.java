package com.packt.samples;


import javax.ejb.Local;

@Local
public interface MyEjb {
	public int myMethod();
}