import java.util.Scanner;


public class Divertidamente_Media
{
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   int alegria = 0;
	   int tristeza = 0;
	   
	   //Media
	   System.out.println("Digite a nota da prova A1:");
	   double a1 = scanner.nextDouble();
	   
	   System.out.println("Digite a nota da prova A2:");
	   double a2 = scanner.nextDouble();
	   
	   System.out.println("Digite a nota da prova A3:");
	   double a3 = scanner.nextDouble();
	   
	   double media = (a1 + a2 + a3) /3;
	   
	   String resultado;
	   resultado = (media >= 7) ? "Aprovada" : "Reprovada";
	   
	   switch (resultado){
	       case "Aprovada":
	           alegria += 50;
	           break;
	       case "Reprovada":
	         tristeza += 50;
	         break;
	       }
	       
	     
	       if (alegria > tristeza){
	           System.out.println("\nA mudança para a nova cidade foi uma experiência incrível para a Riley.");
	       } else if (tristeza > alegria){
	           System.out.println("\nA mudança para a nova cidade foi um experiência desagradável para a Riley");
	       }	           
	           
	      scanner.close();    
	}
}