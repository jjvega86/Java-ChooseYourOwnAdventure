
public class FeatureFactory {
	private Villain[] villains = this.CreateVillains();
	private Setting[] settings = this.CreateSettings();
	private Weapon[] weapons = this.CreateWeapons();
	
	
	public Villain[] CreateVillains() {
		Villain[] villains = {new Villain("Darth Vader"), new Villain("Darth Maul"), new Villain("Darth Sideous")};
		return villains;
	}
	
	public Setting[] CreateSettings() {
		Setting[] settings = {new Setting("Dagobah"), new Setting("Tatooine"), new Setting("Coruscant")};
		return settings;
	}
	
	public Weapon[] CreateWeapons() {
		Weapon[] weapons = {new Weapon("lightsaber", 25), new Weapon("blaster", 20), new Weapon("vibroblade", 10)};
		return weapons;
	}
	
	public String GenerateRandomFeature(String featureType) {
		switch(featureType) {
		case "villain":
			return this.villains[Helpers.GenerateRandomInteger(this.villains.length)].name;
		case "setting":
			return this.settings[Helpers.GenerateRandomInteger(this.settings.length)].name;
		case "weapon":
			return this.weapons[Helpers.GenerateRandomInteger(this.weapons.length)].name;
		default:
			return null;
		}
		
	}

}
