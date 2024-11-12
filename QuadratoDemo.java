package esercizi;

public class QuadratoDemo {
    public static void main(String[] args) {
        long num = 10;
        
        // Instazia dell'oggetto RisolviQuadrato
        RisolviQuadrato quadrato = new RisolviQuadrato();
        
        // Calcolo del quadrato
        long risultato = quadrato.quadrato(num);
        
		if(num > 250000000) {//verifica se il numero è troppo grande
			
			System.out.println("Numero troppo grande!");
		
		}
		else {
			
	        // Stampa del risultato 
	        System.out.println("Il quadrato di: " + num + " e': " + risultato);
	        			
		}
    }
}

