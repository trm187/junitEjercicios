package ual.hmis.sesion06;

public class Ejercicio4 {

	public String devolverCaracteres(String cad1, String cad2) {
		String result = "";
		
		if(cad1 == null || cad2 == null) {
			return null;
		}else if(cad1 == "" || cad2 == "") {
			result = "";
		}else {

			for(int i = 0;i <= cad1.length()-1;i++) {
				for(int j = 0; j <= cad2.length()-1;j++ ) {
					if((cad1.charAt(i) == cad2.charAt(j))) {
						if(result.contains(cad1.charAt(i) + "")) {
							continue;
						}else {
							result = result + cad1.charAt(i);
						}
					}
				}
			}
			
		}
		
		return result;
	}
	
}
