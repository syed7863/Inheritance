package syed;

class CreditCard {
	int cardNo =12345678;
	int pin=523651;
}

class Hacker extends CreditCard
{
	void viewDetails()
	{
		System.out.println(cardNo);
		System.out.println(pin);
	}
}

public class Card {

	public static void main(String[] args) {
		Hacker h=new Hacker();
		h.viewDetails();

	}

}
