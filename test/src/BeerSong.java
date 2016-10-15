
public class BeerSong {
	public static void main(String [] args) {
		int beerNum = 99;
		String word = "Bottles";
		
		while (beerNum > 0){
			
			if (beerNum == 1){
				word = "Bottel";
			}
			System.out.println(beerNum + " " + word + "On the wall");
			System.out.println(beerNum + " " + word);
			System.out.println("Take one down.");
			System.out.println("Pass it around");
			beerNum = beerNum - 1;
			
			if (beerNum > 0){
				System.out.println(beerNum + " " + word + "On the wall");
			}
			else{
				System.out.println("No more beer on the wall");
			}
		}
			
		
	}
}
