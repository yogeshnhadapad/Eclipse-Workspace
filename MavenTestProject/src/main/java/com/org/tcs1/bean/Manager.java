package com.org.tcs1.bean;

public class Manager implements Employee {
	
	DevClass dev;
	opClass op;
	ProdClass prod;
	
	

	public Manager(DevClass dev, opClass op, ProdClass prod) {
		super();
		this.dev = dev;
		this.op = op;
		this.prod = prod;
	}

void callMeeting() {
	dev.doWork();
	op.doWork();
	prod.doWork();
}

	public void doWork() {
		// TODO Auto-generated method stub

	}

}
