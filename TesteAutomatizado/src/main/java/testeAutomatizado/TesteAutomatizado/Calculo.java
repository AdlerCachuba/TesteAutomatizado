package testeAutomatizado.TesteAutomatizado;



public class Calculo {

	public Calculo() {
		
	}
	
	public static int Somar(int a, int b) {
		return a+b;
	}
	
	public static int Subtrair(int a, int b) {
		return a-b;
	}
	
	public static String verifaCor(String a, String b) {
		if((a== "azul" ||b == "azul") && (a== "vermelho"||b == "vermelho")) {
			String violeta = "violeta";
			return violeta;
		}else {
			return "Não é violeta";
		}
	}
	
	
}
