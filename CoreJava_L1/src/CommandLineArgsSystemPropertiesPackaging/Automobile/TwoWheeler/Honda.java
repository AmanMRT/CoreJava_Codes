package CommandLineArgsSystemPropertiesPackaging.Automobile.TwoWheeler;

import CommandLineArgsSystemPropertiesPackaging.Automobile.Vehicle;

public class Honda extends Vehicle
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

	public int cdplayer()
	{
		System.out.println("provides facility to control the cd player device which is available in the car and test all the methods by invoking them.");
		return 0;
	}
}
