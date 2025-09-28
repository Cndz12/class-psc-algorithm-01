import java.util.Scanner;


public class Divertidamente_Exercicio
{
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   int alegria = 0;
	   int tristeza = 0;
	   
	   //Exercicio
	   System.out.println("Digite quantos exercicios Riley fez(0 a 10):");
	   int feitos = scanner.nextInt();
	
	   
	   switch (feitos){
	       case 0:
	           alegria += 0;
	           tristeza += 100;
	           break;
	       case 1:
	         alegria += 10;
	         tristeza += 90;
	         break;
	         
	       case 2:
	         alegria += 20;
	         tristeza += 80;
	         break;
	         
	       case 3:
	         alegria += 30;
	         tristeza += 70;
	         break;
	       
	       case 4:
	         alegria += 40;
	         tristeza += 60;
	         break;
	       
	       case 5:
	         alegria += 50;
	         tristeza += 50;
	         break;
	         
	       case 6:
	         alegria += 60;
	         tristeza += 40;
	         break;
	         
	       case 7:
	         alegria += 70;
	         tristeza += 30;
	         break;
	       case 8:
	         alegria += 80;
	         tristeza += 20;
	         break;
	         
	       case 9:
	         alegria += 90;
	         tristeza += 10;
	         break;
	        
	       case 10:
	         alegria += 100;
	         tristeza += 0;
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