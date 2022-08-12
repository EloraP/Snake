public class Snake{
	
	public boolean alive = true;
	public char direction = 'r';
	int[] head = new int[2], tail = new int[2];
	public int len = 4; 
	
	
	public void died() {
		alive = false;
	}
	
	public void move(String input) {
		if(input == "up") {
			if(direction != 'u') {
				direction = 'u';
				System.out.println(direction);	
			}
		}
		else if(input == "down"){
			if(direction != 'd') {
				direction = 'd';
				System.out.println(direction);	
			}		
		}
		else if(input == "left") {
			if(direction != 'l') {
				direction = 'l';
				System.out.println(direction);	
			}
		}
		else if(input == "right") {
			if(direction != 'r') {
				direction = 'r';
				System.out.println(direction);
			}
		}
	}
	
	
	
}
