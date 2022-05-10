package weekTwo;

public class SwInputData {
	
	public void IdMagicIndex() {
		MagicIndex mg = new MagicIndex();
		int[] arr = {3,2,0,1,3};
		mg.findmagicIndex(arr);
		
	}
	
	public void IDsubset() {
		
		String vset = "abcd";
		PowerSet.subset(vset);
		
		
	}
	
	public void IDrecmul() {
		int ML =2;
		int MD =5;
		int ite =1;
		RecurMult.RecursiveMultiplic(ML, MD, ite);
		//System.out.println(result);
		System.out.println(RecurMult.result);
	}

}
