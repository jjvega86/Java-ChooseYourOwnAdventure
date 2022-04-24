import java.util.ArrayList;

public class Adventure {
	FeatureFactory adventureFactory;
	ArrayList<String> myAdventure;
	
	public Adventure() {
		this.adventureFactory = new FeatureFactory();
		this.myAdventure = new ArrayList<String>();
		this.PopulateAdventure();
	}
	
	public void PopulateAdventure() {
		String myVillain = this.adventureFactory.GenerateRandomFeature("villain");
		String mySetting = this.adventureFactory.GenerateRandomFeature("setting");
		String myWeapon = this.adventureFactory.GenerateRandomFeature("weapon");
		this.myAdventure.add(myVillain);
		this.myAdventure.add(mySetting);
		this.myAdventure.add(myWeapon);
	}
	
	public void DisplayAdventure() {
		for(String feature : this.myAdventure) {
			Helpers.Print(feature);
		}
	}
	
	public void ReselectFeature() {
		String userInput = Helpers.TakeInput("Which feature do you want to change? <1 for Villain, 2 for Setting, 3 for Weapon>");
		int convertedInput = Helpers.ConvertStringToInt(userInput);
		switch(convertedInput) {
			case 1:
				this.myAdventure.set(0, this.adventureFactory.GenerateRandomFeature("villain"));
				Helpers.Print("Your new Villain is " + this.myAdventure.get(0));
				break;
			case 2:
				this.myAdventure.set(1, this.adventureFactory.GenerateRandomFeature("setting"));
				Helpers.Print("Your new Setting is " + this.myAdventure.get(1));
				break;
			case 3:
				this.myAdventure.set(2, this.adventureFactory.GenerateRandomFeature("weapon"));
				Helpers.Print("Your new Weapon is " + this.myAdventure.get(2));
				break;
		}
	}
	
	public void DisplayWelcome() {
		Helpers.Print("Welcome to a Choose Your Star Wars Adventure!");
	}
	
	
	public void RunAdventure() {
		this.DisplayWelcome();
		boolean adventureConfirmed = false;
		do {
			this.DisplayAdventure();
			String userDecision = Helpers.TakeInput("Do you like this adventure? Yes or No.").toLowerCase();
			if(userDecision.equals("yes")) {
				adventureConfirmed = true;
				Helpers.Print("Enjoy your adventure a long time ago!");
			} else {
				this.ReselectFeature();
			}
			
		} while(adventureConfirmed == false);
		
		
	}
	

}
