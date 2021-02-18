// B"H //

import java.util.ArrayList;
import java.util.Collections;

public class LeaderGame
{

    // -- -------------------------------------------------------------------------
	// Instance Variables:
    private ArrayList<Leader> leadersList = new ArrayList<Leader>();
    UserInputHelper userInputHelper = new UserInputHelper();

    // -- -------------------------------------------------------------------------
	// setUpData method:    
    private void setUpData() 
    {

        // Create leaders:
        Leader leader1 = new Leader("L1");
        Leader leader2 = new Leader("L2");
        Leader leader3 = new Leader("L3");
        Leader leader4 = new Leader("L4");
        Leader leader5 = new Leader("L5");

        // Assign their successors:
        leader1.setSuccessor(leader2);
        leader2.setSuccessor(leader3);
        leader3.setSuccessor(leader4);
        leader4.setSuccessor(leader5);

        // Assign them to the leadersList:
        leadersList.add(leader1);
        leadersList.add(leader2);
        leadersList.add(leader3);
        leadersList.add(leader4);
        leadersList.add(leader5);


        // -- -------------------------------------------------------------------------
        // Assign randomNonSuccessors and successorAndNonSuccessorShuffle     
        for (Leader vLeader : leadersList) 
        {
            vLeader.setupRandomNonSuccessors(leadersList);
            vLeader.setupSuccessorAndNonSuccessorShuffle();
            vLeader.setCorrectAnswer();
            vLeader.printOutLeaderInfo();
        } 


    } // end of setUpData() method


    // -- -------------------------------------------------------------------------
    // startPlaying method:  
    private void startPlaying()
    {
        System.out.println(" ");
        String userName = userInputHelper.getUserInput("Enter your name:");
        System.out.println(" ");
        System.out.println("Hey "+userName+" - you cracker-head! Let's play hard-ball!!");
        System.out.println(" ");

        Collections.shuffle(leadersList);

        int wrongAnswerCount = 0;

        for(int i = 0; i < 3; i++)
        {

            if (i == 0)
            {
                System.out.println("Ok here goes the first question:");
                System.out.println(" ");
            }    
            else
            {
                System.out.println("Let's ask you another question:");
                System.out.println(" ");
            }    

            System.out.println(" -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
            System.out.println("My name is "+leadersList.get(i).getName()+"; who is my successor?");
            System.out.println("        a) "+leadersList.get(i).getsuccessorAndNonSuccessorShuffle().get(0).getName());
            System.out.println("        b) "+leadersList.get(i).getsuccessorAndNonSuccessorShuffle().get(1).getName());
            System.out.println("        c) "+leadersList.get(i).getsuccessorAndNonSuccessorShuffle().get(2).getName());
            System.out.println("        d) None of the above");
            System.out.println(" -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- ");
            System.out.println(" ");

            while (wrongAnswerCount < 3)
            {                
                String userGuess = userInputHelper.getUserInput("Enter a, b, c, or d: ");
                
                if (userGuess.equals(leadersList.get(i).getCorrectAnswer()))
                {
                    System.out.println(" ");
                    System.out.println("Correct!");
                    break;
                }    
                else
                {
                    System.out.println(" ");
                    System.out.println("Wrong!");
                    System.out.println(" ");
                    wrongAnswerCount++;

                    if (wrongAnswerCount < 3)
                    {
                        System.out.println("Try again.");
                        System.out.println(" ");
                    }

                }
 
            }

            if (wrongAnswerCount == 3)
            {
                break;
            }             
        }    

        if (wrongAnswerCount == 3)
        {
            System.out.println(" ");
            System.out.println(userName+" dude - man oh man you iz done lost!!!");
        } 
        else
        {
            System.out.println(" ");
            System.out.println(userName+" dats what me talkin' about - YOU WON!!!");
        }

    }



    // -- -------------------------------------------------------------------------
	// "main" method to run game:    
    public static void main(String[] args) {
        LeaderGame game = new LeaderGame();
        game.setUpData();
        game.startPlaying();
    }

}   	