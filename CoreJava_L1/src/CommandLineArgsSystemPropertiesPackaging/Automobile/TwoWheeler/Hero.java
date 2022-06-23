package CommandLineArgsSystemPropertiesPackaging.Automobile.TwoWheeler;

import CommandLineArgsSystemPropertiesPackaging.Automobile.Vehicle;

public class Hero extends Vehicle
{
	int speed = 100;
	
	@Override
	public String modelName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String registrationNumber() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ownerName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int speed()
	{
		//System.out.println("Returns the current speed of the vehicle.");
		return speed;
	}
	
	public void radio()
	{
		System.out.println("provides facility to control the radio device.");
	}
	
}