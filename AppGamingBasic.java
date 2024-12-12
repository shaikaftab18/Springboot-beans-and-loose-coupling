package com.shakaftabahmed;

public class AppGamingBasic {
  public static void main(String[] args) {
//	  var game=new SuperContraGame();
 var game=new PacMan();
//	  var game=new MarioGame();
	  var gameRunner =new Gamerunner(game);
	  gameRunner.run();
  }
}
