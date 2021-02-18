// B"H //

import java.util.ArrayList;
import java.util.Collections;

public class Leader 
{

    // -- -------------------------------------------------------------------------
	// Instance Variables:
   	private String name;
   	private Leader successor; 
   	private ArrayList<Leader> randomNonSuccessors; 
    private ArrayList<Leader> successorAndNonSuccessorShuffle;
    private String correctAnswer;

    // -- -------------------------------------------------------------------------
    // Constructor:

    public Leader(String pName)
    {
    	name = pName;
    	randomNonSuccessors = new ArrayList<Leader>();
        successorAndNonSuccessorShuffle = new ArrayList<Leader>();
    }

    // -- -------------------------------------------------------------------------
    // Methods
    
    public String getName() 
    {
    	return name;
    }

    public void setName(String pName) 
    {
        name = pName;
        
    }
    
    // -- -------------------------------------------------------------------------

    public Leader getSuccessor() 
    {
    	return successor;
    }

    public void setSuccessor(Leader pSuccessor) 
    {
        successor = pSuccessor;
        
    }

    // -- -------------------------------------------------------------------------

    public ArrayList<Leader> getRandomNonSuccessors() 
    {
    	return randomNonSuccessors;
    }


    public void setupRandomNonSuccessors(ArrayList<Leader> pLeadersList)
    {
        // Deep-copy pLeadersList so we can use a 
        // completely separate ArrayList object to manipulate      
        ArrayList<Leader> leadersListCopy = new ArrayList<Leader>();
        for  (Leader vLeaderToCopy : pLeadersList) 
        {
            if (vLeaderToCopy != this && vLeaderToCopy != successor)
            {
                leadersListCopy.add(vLeaderToCopy);
            }    
            
        }


        Collections.shuffle(leadersListCopy);

        int count = 0;

        for (Leader vLeader : leadersListCopy) 
        {
            randomNonSuccessors.add(vLeader);
            count++;
            if (count==3) {break;}
        }    
      
    }


    // -- -------------------------------------------------------------------------

    public ArrayList<Leader> getsuccessorAndNonSuccessorShuffle() 
    {
        return successorAndNonSuccessorShuffle;
    }

    public void setupSuccessorAndNonSuccessorShuffle()
    {        
        successorAndNonSuccessorShuffle.addAll(randomNonSuccessors);

        if (successor != null)
        {
            successorAndNonSuccessorShuffle.add(successor);
        }    

        Collections.shuffle(successorAndNonSuccessorShuffle);

        if (successorAndNonSuccessorShuffle.size() == 4)
        {
            successorAndNonSuccessorShuffle.remove(3);
        }   

    }

    // -- -------------------------------------------------------------------------

    public String getCorrectAnswer() 
    {
        return correctAnswer;
    }


    public void setCorrectAnswer()
    {
        switch (successorAndNonSuccessorShuffle.indexOf(successor))
        {
            case 0: correctAnswer = "a";
                    break;
            case 1: correctAnswer = "b";
                    break;
            case 2: correctAnswer = "c";
                    break;       
            default: correctAnswer = "d";
                    break;                                                
        }
    }


    // -- -------------------------------------------------------------------------

    public void printOutLeaderInfo()
    {
        System.out.println("-- -- -- -- -- -- -- -- -- -- -- --");
        
        System.out.println("Leader Name: "+name);    
        
        if (successor != null)
        {
            System.out.println("Successor: "+successor.getName());
        }
        else 
        {
            System.out.println("No Successor");
        } 


        for (Leader vLeader : successorAndNonSuccessorShuffle)
        {
            System.out.println("Answer Option: "+vLeader.getName());
        } 

        System.out.println("Correct Answer: "+correctAnswer); 
    }

}