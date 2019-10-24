
public class Character {
	public int hp;
	public String name;
	
	public void showHp() {
		System.out.println(name+"の現在のHP:"+hp);
	}
	public void attack(Character ch) {
		System.out.println(name+"の攻撃！");
		ch.downHp(5);
		ch.showHp();
	}
	public void downHp(int hp) {
		this.hp=this.hp-hp;
		if(this.hp<=0) {
			this.hp=0;
		}
		
		
	}

}
