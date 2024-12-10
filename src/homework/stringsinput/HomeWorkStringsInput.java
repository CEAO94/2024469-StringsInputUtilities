/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework.stringsinput;

import inpututilities.InputUtilities;
import java.util.Scanner;

/**
 *
 * @author carlo
 * 
 */
public class HomeWorkStringsInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String firstName; //String to define the user first name 
        String lastName; //String to define the user last name
        String newName; //String to be used in substring method to separate the one letter that metters to switch rules and new BRAZILIAN name. 
        
        
        InputUtilities userName = new InputUtilities(); //IMPORT the pré-definied program. I don't need to write the Scanner again, It's already done in Inpututilities file.
        
        try { //try catch to make sure a error message to the user. 
        
        firstName = userName.askUserForText("Please, enter your FIRST name:"); //askUserForText is the name of the prompt in the InputUtilies for a Scanner Program that will ask a text from the User.  
        lastName = userName.askUserForText("Now, enter your LAST name:"); //Same idea. Using the InputUtilities, prompt askUserForText to use a pré-definied Scanner Program. 
        
        firstName.toUpperCase(); //String Manipulation to transforme the text message / input in UPPERCASE.
        lastName.toUpperCase(); //Using UPPERCASE to allow the perfect match with SWITCH Set Up. 
        newName = lastName.substring(0, 1); //Also, I used substring to separete the FIRST letter in the LAST NAME, using as a rule the change the name. 
               
        switch (newName) { //switch method used as IF, result. Will compare the first letter of your LAST NAME input with a alphabetic letter to define a Brazilian name. 
        
        case "A": case "B": case "C": case "D": case "E": //in case, the last name will be swaped by DA SILVA. 
        System.out.println("Your name in Brazil could be " + firstName + "ão"+ " da Silva."); 
        break; //in case the letter matches here, with the BREAK rule the system will understand that the task is completely. 
        
        case "F": case "G": case "H": case "I": case "J": //in case, the last name will be swaped by DA PEREIRA.
        System.out.println("Your name in Brazil could be " + firstName + "ão"+ " Pereira."); //Also, I set up a rule to add AO to the first name, which represents something big.
        break; //in case the letter matches here, with the BREAK rule the system will understand that the task is completely. 
        
        case "K": case "L": case "M": case "N": case "O": //in case, the last name will be swaped by Rodrigues.
        System.out.println("Your name in Brazil could be " + firstName + "ão"+ " Moraes."); //Also, I set up a rule to add AO to the first name, which represents something big.
        break; //in case the letter matches here, with the BREAK rule the system will understand that the task is completely.
        
        case "P": case "Q": case "R": case "S": case "T": //in case, the last name will be swaped by SOUZA.
        System.out.println("Your name in Brazil could be " + firstName + "nho"+ " Souza."); //Also, I set up a rule to add AO to the first name, which represents something small.
        break; //in case the letter matches here, with the BREAK rule the system will understand that the task is completely.     
                
        case "U": case "V": case "W": case "X": case "Y": //in case, the last name will be swaped by DA SILVEIRA.
        System.out.println("Your name in Brazil could be " + firstName + "nho"+ " Silveira."); //Also, I set up a rule to add AO to the first name, which represents something small.
        break; //in case the letter matches here, with the BREAK rule the system will understand that the task is completely.        
        
        case "Z": //in case, the last name will be swaped by Alves.   
        System.out.println("Your name in Brazil could be " + firstName + "nho"+ " Alves."); //Also, I set up a rule to add AO to the first name, which represents something small.
        break;
        
        default: //in case any of the rules applies, will call the default.
        System.out.println("Try again with your middle name.");
            
        } //try catch to make sure a error message to the user. 
        } catch (Exception e) {
        System.out.println("Check your input. Make sure it is just letters.");} 
        
        
        
        
        
        
        
        } 
        
        }
           
    
    

