package syed;

class Plane
{
	void takeoff()
	{
		System.out.println("Plane is f");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void carryCargo()
	{
		System.out.println("Carryplane is carrying cargo");
	}
}
class FighterPlane extends Plane
{
	void fly()
	{
		System.out.println("Fighter plane is flying at medium");
	}
	void carryWeapons()
	{
		System.out.println("FighterPlane carry weapons");
	}
}

public class Main {

	public static void main(String[] args) {
		CargoPlane cp=new CargoPlane();
		PassengerPlane pp=new PassengerPlane();
		FighterPlane fp=new FighterPlane();
		cp.takeoff();
		cp.fly();
		cp.carryCargo();
		System.out.println("=================");
		
		pp.takeoff();
		pp.fly();
		pp.land();
		pp.carryPassenger();
		
		
		

	}

}
