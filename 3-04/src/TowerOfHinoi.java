
public class TowerOfHinoi {
	public void start(int height) {
		//starts game
		moveTower(height, "a", "b", "c");
	}
	public void moveTower(int height, String fromPole, String toPole, String withPole){
		//does game until finished
		if (height >= 1) {
			moveTower(height - 1, fromPole, withPole, toPole);
			moveDisk(fromPole, toPole);
			moveTower(height - 1, withPole, toPole, fromPole);
		}
	}
	
	public void moveDisk(String fp,String tp) {
		//prints what is happening
		System.out.println("Moving disk from " + fp + " to " + tp );
	}
}
