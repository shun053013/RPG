
public class StartApp {

	public static void main(String[] args) {
		Hero hero =new Hero();
		
		hero.name ="ロト";
		hero.hp = 20;
		
		hero.show();
				
//		hero.showHp();
		
		Slime slime = new Slime();
		
		slime.name="メタルスライム";
		slime.hp=10;
		slime.show();
//		slime.showHp();
		slime.attack(hero);
		slime.talk("ぽよよ〜ん。");
		
		
		
		

	}

}
