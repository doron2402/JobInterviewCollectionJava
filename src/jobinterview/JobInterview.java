/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobinterview;

/**
 *
 * @author dsegal
 * 
 */
public class JobInterview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // is unique
        System.out.println("IsUnique:");
        IsUnique isUnique = new IsUnique();
        isUnique.runTests();
        
        //Check Premutations
        System.out.println("Check Premutations:");
        CheckPermutations premutations = new CheckPermutations();
        premutations.runTests();
        
        //URLify
        URLify urlify = new URLify();
        urlify.runTests();
        
        //SumLists
        SumLists sumLists = new SumLists();
        sumLists.runTests();
    }
    
}
