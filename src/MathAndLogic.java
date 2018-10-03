
public class MathAndLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q1: Heavy bottle
		System.out.println("Which is the heavy bottle?");
		heavyBottle(20, 8); //passing 20 bottles, number 8 is heavy

	}
	
	
	//Q1: 20 pill bottles. 19 have 1 gram pills. 1 has 1.1 gram pills. Find the heavy bottle.
	//You have a scale but can use it only once. It's a scale, not a balance.
	
	//Tips: Constraints are clues to solving logic puzzles.
	
	//My guess (with a hint): take 1 pill from bottle 1, 2 pills from bottle 2, etc...
	//find the total weight. Figure out how many "extra" grams there are and that is the heavy bottle!
	
	//totalNormalWeight = sum of 1+2+3...+20 (it's 210)
	//totalActualWeight = totalNormalWeight + extraGrams
	//extraGrams = totalActual = totalNormal
	//extraWeightPerPill = .1
	//totalExtraWeight = extraGrams/extraWeightPerPill (i.e., 1.)
	
	//you'll write it to be tinkered with, so you can see.
	//maybe do it with a random number
	
	public static void heavyBottle(int totalBottles, int bottleNumber) {
		float normalPillWeight = 1;
		float heavyPillWeight = 1.1f;
		//int totalBottles = 20; //you could make this a parameter too.
		float totalNormalPillWeight = 0;
		float totalActualPillWeight = 0;
		
		for (int i = 1; i <= totalBottles; i++) {
			totalNormalPillWeight += (normalPillWeight * i);
		}
		
		//testing that loop works:
		System.out.println(totalNormalPillWeight);
		
		for (int i = 1; i <= totalBottles; i++) {
			if (i == bottleNumber) {
				totalActualPillWeight += (heavyPillWeight * i);
			}
			else {
				totalActualPillWeight += (normalPillWeight *i);
			}
		}
		
		//testing that loop works:
		System.out.println(totalActualPillWeight);
		
		//nice. keep going... just calc the heavy bottle.
	}

}
