abstract class Fighter {
	
	boolean spellPrepared = false;
	
	boolean isVulnerable() {
		return false;
	}
	
	abstract int damagePoints(Fighter fighter);
	
}

class Warrior extends Fighter {
	
	@Override
	public String toString() {
		return "Fighter is a Warrior";
	}
	
	@Override
	int damagePoints(Fighter wizard) {
		return !wizard.isVulnerable() ? 6 : 10;
	}
}

class Wizard extends Fighter {
	
	@Override
	boolean isVulnerable() {
		return !spellPrepared;
	}
	
	@Override
	int damagePoints(Fighter warrior) {
		return spellPrepared ? 12 : 3;
	}
	
	void prepareSpell() {
		this.spellPrepared = true;
		System.out.println("Spell prepared");
	}
	
	@Override
	public String toString() {
		return "Fighter is a Wizard";
	}
	
}
