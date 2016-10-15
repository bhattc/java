
public class PhraseOMatic {
	public static void main (String[] args){
		//create three word lists
		String[] wordListOne = {"24/7", "multitier", "30000 feet", "B -to- B", "win - win", "front end", "web based","pervasive","smart"};
		String[] wordListTwo = {"empowered", "sticky", "value added", "oriented" };
		String[] wordListThree = {"Process", "tippng point", "solution", "architecture"};
		
		//find length
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;
		
		//generate random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);
		
		// build a phrase
		String phrase = wordListOne[rand1] +" " + wordListTwo[rand2] +" " + wordListThree[rand3];
		
		System.out.println("What we need is a " + phrase);
	}
}
