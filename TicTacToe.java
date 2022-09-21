package GAME.game;

import java.util.Scanner;

public class TicTacToe{
	
	static char[] board = new char[10];
	public static void board() {
		for(int i=1; i<10; i++) {
			board[i]=' ';
		}
	}
	
	static void letter(char i){
		if(i=='X') {
			System.out.println("PLAYER CHOSSED :" +i);
		}
		else
			System.out.println("PLAYER CHOSSED:O ");
		
	  }
	public static void main(String[] args) {
	System.out.println("WELCOME TO TIC TAE TOE");
	board();
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter you choice wheather X OR Y");
    char a = sc.next().charAt(0); 
    letter(a);
    
	}

		
	
}
