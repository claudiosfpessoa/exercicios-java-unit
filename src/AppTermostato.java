
public class AppTermostato {

	public static void main(String[] args) {
		
		Termostato termostato = new Termostato();
		
		System.out.println(termostato.temperatura);
		System.out.println(termostato.status);
		
		
		termostato.ligar();
		
		System.out.println(termostato.temperatura);
		System.out.println(termostato.status);
		
		

	}
	
	public static void mostrarStatus(Termostato termostato) {
		
		System.out.println("Status: " + termostato.status);
		System.out.println("Status: " + termostato.temperatura);
	}

}
