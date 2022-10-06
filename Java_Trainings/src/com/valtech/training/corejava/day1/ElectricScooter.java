package com.valtech.training.corejava.day1;

public class ElectricScooter extends Vehicle{

	public void accelerate() {
		System.out.println("More power to motor");
	}

	@Override
	public void applyBrakes() {
		// TODO Auto-generated method stub
		System.out.println("Cutoff power to motor");
	}
}
