import java.util.Random;

public class Loterie {
    public int[] numereLoterie(){
    	Random r=new Random(49);
    	int nr[]=new int[6];
    	for(int i=0; i<6; i++){
    		nr[i]=r.nextInt(49)+1;
    	}
    	return nr;
    }
}
