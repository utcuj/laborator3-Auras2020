package ex3;

public class Exer3 {
	
	public static boolean isVocala(char x) {
		char v[]= {'a', 'e', 'i', 'o', 'u'};
        for(int i=0; i<5; i++) {
      	  if(x==v[i]){
      		  return true;
      	  }	    
	    }
        return false;
	}
        

	public static void main(String[] args) {
		
          String cuvant="abecedar";
          int voc=0, cons=0;
          char v[]= {'a', 'e', 'i', 'o', 'u'};
          for(int j=0; j<cuvant.length(); j++) {
        	  if(isVocala(cuvant.charAt(j))){
        		  voc++;
        	  }	  
          }  
          cons=cuvant.length()-voc;
          System.out.println(cons);
          System.out.println(voc);
	}
    
}
