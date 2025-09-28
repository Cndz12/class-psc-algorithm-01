import java.util.Scanner;


public class Divertidamente_Amizades
{
	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   
	   int alegria = 0;
	   int tristeza = 0;
	   
	   // Amizade
	   System.out.println("Quantas amizades Riley fez?");
	   int amizades = scanner.nextInt();
	   
	   switch (amizades){
	       case 0:
	           tristeza += 30;
	           break;
	       default:
	         alegria += amizades * 10;
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