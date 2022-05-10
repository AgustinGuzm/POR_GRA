package weekTwo;
/**
* 1) Magic Index: A magic index in an array A [ 0 ... n -1] is defined to be an index such that A[i] = i. 
* Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in array A.
* Follow up: What if the values are not distinct?
**/
public class MagicIndex {
	
	public void findmagicIndex(int[] arr){
		//determinate the long of array
		int larr = arr.length;
		boolean nmif = true;
		//finding the magic index
		for (int i=0; i<larr; i++){
			if(i== arr[i]) {
				System.out.println("Magic index is. " + i );
				nmif = false;
			}
		}
		if(nmif) System.out.println("No Magic Index Found");
		
	}
	

}
