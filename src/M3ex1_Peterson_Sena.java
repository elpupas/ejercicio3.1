import java.util.Scanner;
/*
 * ejercicio que pide al usuario, nombre y apellido y edad y luego lo imprime por pantalla
 * ejercicie, that want ar user, name and lastname, age and late print for screen 
 */

public class M3ex1_Peterson_Sena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String nom;
         String cog;
         int edad;
        // full name with age, printscreen 
         Scanner entrada = new Scanner(System.in);
       System.out.println("Escriba su nombre");  
       nom = entrada.nextLine();
       System.out.println("Escriba sus apellidos");
       cog = entrada.nextLine();
       System.out.println("escriba su edad");
       edad = entrada.nextInt();
       
       if(edad <= 0 ) {
    	   System.out.println("Digite una edad correcta");
    	   edad = entrada.nextInt();
       }
       
       System.out.println("Su nombre es " + nom + " " + cog + " con " + edad 
    		   + " años");
       
       
         
	}

}
