package studio2;

public class Pi {

	public static void main(String[] args) {
		int currentHit = 0;
		int hits = 500000000;
		int successCount = 0;
		
		while (currentHit < hits) {
			double randomX = Math.random();
			double randomY = Math.random();
			
			double distance = Math.sqrt(Math.pow(randomX - 0.5, 2) + Math.pow(randomY - 0.5, 2));
			
			if (distance <= 0.5) {
				successCount++;
			}
			
			currentHit++;
		}
		
		double pi = (successCount * 1.0 / hits) * 4;
		System.out.println("Pi: " + pi);
		
	}

}
