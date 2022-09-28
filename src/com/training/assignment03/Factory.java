package com.training.assignment03;

public class Factory {

	public Sport getSport(String sportName) {
		
		if(sportName.equals("Badminton"))
			return new Badminton();
		else if(sportName.equals("Football"))
			return new Football();
		else return null;
	}
}
