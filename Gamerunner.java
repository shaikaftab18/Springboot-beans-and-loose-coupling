package com.shakaftabahmed;

public class Gamerunner {
private GamingConsole game;
 public Gamerunner(GamingConsole game) {
	 this.game=game;
 }
public void run() {
	// TODO Auto-generated method stub
	System.out.println("Running game:" +game);
	game.up();
	game.down();
	game.left();
	game.right();
}
}
