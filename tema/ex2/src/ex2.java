
public class ex2 {

	public static void main(String[] args) {
    
		int varsta=15, sex=1, inaltime=32;
		short info_impachetare;
		
		//impachetare
		info_impachetare=(short)((varsta<<1 | sex)<<8 | inaltime);
		
		//despachetare
		inaltime=info_impachetare & 0xff;
		sex=(info_impachetare >>> 8) & 1;
		varsta=(info_impachetare >>> 9) & 0x7f;
		
		System.out.println(inaltime);
		System.out.println(sex);
		System.out.println(varsta);
	}

}
