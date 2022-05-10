package weekTwo;
/**
 * Power Set: Write a method to return all subsets of a set.
 * 
 *
 */
public class PowerSet {
	public static void subset(String sets) {
		
		int lset = sets.length();
		String sset ="";
		System.out.println(sets);
		for(int i=0 ; i < lset ; i++) {
			sset = "";
			if(i != lset-2) {
				sset = sset+sets.charAt(i);
				System.out.println(sset);
				for(int k=i+1 ; k< lset ; k++) {
					System.out.println( sset + sets.charAt(k));
				}
			}
			
		}
		
	}

}
