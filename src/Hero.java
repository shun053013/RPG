
public class Hero extends Character implements Appear{
	public void show() {
		System.out.println("勇者"+name+"の登場！");
//		System.out.println(this.hp);
		showHp();
		
	}

}
