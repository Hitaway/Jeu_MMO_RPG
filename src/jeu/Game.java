package jeu;
import java.util.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.*;
public class Game {
	
	
	public static void main(String [] args){
		Toolkit TK= Toolkit.getDefaultToolkit();
		Dimension dim= TK.getScreenSize();
		new FenJeu("Jeu",0,0,dim.width-400,dim.height-200);
	/*	String s=null;
		Character C=null;
		do{
			Scanner input=new Scanner(System.in);
			if(C==null){
				do{
				
				System.out.println("\nMain Menu\n0. Quit\n1. Create a Character\n2. Load Character");
				s=input.next();
				}while(!(s.equals("0") || s.equals("1") || s.equals("2")));
			}
			
			else{
				do{
					System.out.println("\nMain Menu\n0. Quit\n1. Create a new character\n2. Load Character\n3. Save Character\n4. Fight\n5. Inventory\n6. Show Skill\n7. Upgrade Statistics\n8. Show character's statistics");
					s=input.next();
				}while(!(s.equals("0") || s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("5") || s.equals("6") || s.equals("7") || s.equals("8")));
			}
			
			if(s.equals("1")){
				C=new Character();
				C=Character.createCharacter();
			}
			else if(s.equals("2")){
				do{
					System.out.println("\nWhich Slot ?(1,2,3,4) or Cancel(C)");
					s=input.next();
				}while(!(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("C")));
				try{
					if(!(s.equals("C"))){
						C=new Character(Character.charger("Sauvegarde"+s, C));
						System.out.println(C);
					}
				}
				catch(NullPointerException e){
					
				}
				
			}
			else if(s.equals("3")){
				do{
					System.out.println("\nWhich Slot ?(1,2,3,4) or Cancel(C)");
					s=input.next();
				}while(!(s.equals("1") || s.equals("2") || s.equals("3") || s.equals("4") || s.equals("C")));
				if(!(s.equals("C")))
					Character.sauvegarder("Sauvegarde"+s, C);
				
			}
			
			else if(s.equals("4")){
				Character Char=new Character();
				Char=Character.charger("Sauvegarde4", Char);
				if(C.getShi()==null || C.getWea()==null)
					System.out.println("You can't fight without weapon or shield");
				else{
				Fight f= new Fight(C,Char);
				f.StartFight();
				}
			}
			else if(s.equals("5")){
				
				do{	
					System.out.println("\nWeapon : "+C.getWea());
					System.out.println("\nShield : "+C.getShi());
					do{
						System.out.println("\nDo you want to change your weapon(W) or your shield(S), Back(B)");
						s=input.next();
					}while(!(s.equals("W") || s.equals("S") || s.equals("B")));
					if(s.equals("W"))
						C.ChoseWeapon();
					else if(s.equals("S"))
						C.ChoseShield();
				}while(!(s.equals("B")));
			}
			else if(s.equals("6")){
					System.out.println(C.SkillList());
			
			}
			
			else if(s.equals("7")){
				C.UpgradeStat(C);
				C.setVIT();
			}
			
			else if(s.equals("8")){
				System.out.println(C);
			}
			
			
		
		
		}while(!(s.equals("0")));
		System.out.println("Thanks for playing.");*/
	}
}
	

