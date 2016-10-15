package guessGame;

public class GuessGame {
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I am thinking of number between 0 and 9");
		
		while(true){
			System.out.println("number to guess is " + targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Player 1 guessed " + guessp1);
			
			guessp1 = p2.number;
			System.out.println("Player 2 guessed " + guessp2);
			
			guessp1 = p3.number;
			System.out.println("Player 3 guessed " + guessp3);
			
			if(guessp1 == targetNumber){
				p1isRight = true;
				
			}
			
			if(guessp2 == targetNumber){
				p2isRight = true;
				
			}
			
			if(guessp3 == targetNumber){
				p3isRight = true;
				
			}
			
			if (p1isRight || p2isRight || p3isRight){
				System.out.println("we have a winner");
				System.out.println("Player 1? " + p1isRight);
				System.out.println("player 2?" + p2isRight);
				System.out.println("Player 3?" + p3isRight);
				System.out.println("Game Over");
				break;
				
			}
			else{
				System.out.println("Play again");
				
			}
		}
	}

}
