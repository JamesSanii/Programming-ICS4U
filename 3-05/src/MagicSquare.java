
public class MagicSquare {
	Integer[] a = new Integer[] {1,2,3,4,5,6,7,8,9};
	Integer[] b = new Integer[] {0,1,2,3,4,5,6,7,8,9};
	
	public boolean isMagic(Integer[] square) {
		if(square.length != 9) {
			return false;
		}
		else if(square[0] + square[1]+square[2] != 15) {
			return false;
		}
		else if(square[3] + square[4]+square[5] != 15) {
			return false;
		}
		else if(square[6] + square[7]+square[8] != 15) {
			return false;
		}
		else if(square[0] + square[3]+square[6] != 15) {
			return false;
		}
		else if(square[1] + square[4]+square[7] != 15) {
			return false;
		}
		else if(square[2] + square[5]+square[8] != 15) {
			return false;
		}
		else if(square[0] + square[4]+square[8] != 15) {
			return false;
		}
		else if(square[2] + square[4]+square[6] != 15) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void threeByThreeMagicSquare(int n) {
		for(int i = 0;i < 8; i++) {
			if(b[i] == 1) {
				a[n]=1;
				b[i]=1;
				if(n < 9) {
					threeByThreeMagicSquare(n+1);
				}
				else {
					if (isMagic(a) == true) {
						System.out.println(a);
					}
				}
				b[i] = 0;	
			}
		}
		
	}
	
}
