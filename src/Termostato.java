
public class Termostato {
	
	int temperatura;
	boolean status;
	
	void aumentarTemp() {
		if  (this.temperatura < 85 && this.status == true) {
		this.temperatura++;
		
		}
	}
	
	void diminuirTemp() {
		if  (this.temperatura > 80 && this.status == true) {
		this.temperatura--;

		}
		
		
				
	}
	void ligar() {
		if(this.status == false) {
		this.status = true;
		this.temperatura =80;
			
			
		}
		
	}
	void desligar() {
		if(this.status == true) {
			this.status = false;
			
		}
	}
	
}
