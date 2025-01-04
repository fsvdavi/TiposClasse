package pacote2default;

public class Classe2 {
	 String atributo1;
	 boolean atributo2;
	 float atributo3;

	    public static void main(String[] args) {
	        // Tentativa de instancia da Classe1
	    	
	        // Classe1 objeto1 = new Classe1();
	        // objeto1.atributo1 = "Texto da Classe1"; 
	        // objeto1.atributo2 = 42;      
	        // objeto1.atributo3 = 3.14;

	        // Tentativa de instancia da Classe2
	    	
	        Classe2 objeto2 = new Classe2();
	        objeto2.atributo1 = "Texto da Classe2";
	        objeto2.atributo2 = true;
	        objeto2.atributo3 = 2.71f;
	        
	     // Acontece um erro ao tentar instanciar os atributos da classe1 
	     // por não serem públicos e estarem em pacotes diferentes.
	        
}
}