package exercise1;

public class Player {
	private Weapon weapon;
	
	
	public Player(){
	}
	
	public Player(Weapon weapon) {
		this.weapon = weapon;
	}
	
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
//	���⸦ ����Ҷ� ȣ���ϴ� �޼ҵ带 ����
	public void usePlayerWeapon() {
		weapon.useWeapon();
	}
	
	
	
	
	
}
