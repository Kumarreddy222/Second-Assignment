import java.util.Scanner;

class Guesser
{
	
	 int guesserGuessedNumber;
	          public int guesserGuessingNumber()
	         {  
	        	  Scanner scan = new Scanner(System.in);
	        	  guesserGuessedNumber = scan.nextInt();
	        	  {
	        		   if(guesserGuessedNumber <= 100)
	        	       {
	        		   System.out.println("Guesser kindly guess the number");
	                   }
	        	      else 
	        	      {
	        		    System.out.println("Guesser kindly guess the number in the range of 1 to 100");
	        	       }
	        	  }
	        	  
	        	    guesserGuessedNumber = scan.nextInt();
	        	  return guesserGuessedNumber;
	         }
			
}


class Player1
{
    int player1GuessedNumber;
	                  public int playerGuessingNumber()
	                  {
	                	  Scanner scan = new Scanner(System.in);
	                	  System.out.println("Player1 kindly guess the number");
	                	  player1GuessedNumber = scan.nextInt();
	                	  return player1GuessedNumber;
	                  }
}
class Player2
{
    int player2GuessedNumber;
	                  public int playerGuessingNumber()
	                  {
	                	  Scanner scan = new Scanner(System.in);
	                	  System.out.println("Player2 kindly guess the number");
	                	  player2GuessedNumber = scan.nextInt();
	                	  return player2GuessedNumber;
	                  }
}
class Player3
{
    int player3GuessedNumber;
	                  public int playerGuessingNumber()
	                  {
	                	  Scanner scan = new Scanner(System.in);
	                	  System.out.println("Player3 kindly guess the number");
	                	  player3GuessedNumber = scan.nextInt();
	                	  return player3GuessedNumber;
	                  }
}



class Umpire
{   
	  int numberFromGuesser;
	  int numberFromPlayer1;
	  int numberFromPlayer2;
	  int numberFromPlayer3;  
	                         public  void collectingNumberFromGuesser()
	                         {
	                        	 Guesser g = new Guesser();
	                            numberFromGuesser= g.guesserGuessingNumber();
	                         } 
	                        
	                         public  void collectingNumberFromplayer1()
	                         {
	                            Player1 p1 =new Player1();
	                           
	                            numberFromPlayer1=p1.playerGuessingNumber();
	                            
	                         }
	                         public  void collectingNumberFromplayer2()
	                         {
	                            Player2 p2 =new Player2();
	                           
	                            numberFromPlayer2=p2.playerGuessingNumber();
	                            
	                         }
	                         public  void collectingNumberFromplayer3()
	                         {
	                            Player3 p3 =new Player3();
	                           
	                            numberFromPlayer3=p3.playerGuessingNumber();
	                            
	                         }



                              public void compare()
                              {
                            	  if(numberFromGuesser==numberFromPlayer1)
                            	  { 
                            		  if(numberFromGuesser == numberFromPlayer2 && numberFromGuesser == numberFromPlayer3)
                            		  {
                            			  System.out.println("Game is tied");
                            		  }
                            		  else if(numberFromGuesser == numberFromPlayer2)
                            		  {
                            			  System.out.println("Player1 and Player2 Won the game");
                            		  }
                            		  else if(numberFromGuesser == numberFromPlayer3)
                            		  {
                            			  System.out.println("Player1 and Player3 won the game");
                            		  }
                            		  else
                            		  {
                            	           System.out.println("Player1 Won the game");
                            		  }
                            	  }
                            	  else if(numberFromGuesser == numberFromPlayer2)
                            	  {
                            		  if(numberFromGuesser == numberFromPlayer3)
                            		  {
                            			  System.out.println("Player2 and Player3  won the game");
                            		  }
                            		  else
                            		  {
                            			  System.out.println("Player2 won the game");
                            		  }
                            	  }
                            	  else if (numberFromGuesser == numberFromPlayer3)
                            	  {
                            		  System.out.println("Player3 won the game");
                            	  }
                            	  else
                            	  {
                            		  System.out.println("Game lost by all the players");
                            	  }
                               }
}

public class LaunchGame 
{
	public static void main(String args[]) 
	{
		Umpire u = new Umpire();
		u.collectingNumberFromGuesser();
		u.collectingNumberFromplayer1();
		u.collectingNumberFromplayer2();
		u.collectingNumberFromplayer3();
		u.compare();
    }

}
