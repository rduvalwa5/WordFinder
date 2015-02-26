package wordFinder;
/*
 * This si a string solution to the palidrome test
*/

import java.util.*;

public class isStringPalidrome_String {
	public  Boolean testStringWithPlus(String input){
	      String original = input;  
	      int length = original.length();
	      
		  String reverse ="";
		  /*
		   * Read string in reverse
		   */
		  for ( int i = length - 1; i >= 0; i-- ){
		         reverse = reverse + original.charAt(i);  
	      }
	      if (original.equals(reverse)){
	    	  System.out.println("Entered string is a palindrome." + input);
	      	  return true;}
	      else{
	    	  	System.out.println("Entered string is not a palindrome." + input);
	      		return false;}
	   }
	
	public  Boolean testStringWithArray(String input){
	      String original = input;  
	      int length = original.length();
		  /*
		   * To use ArrayList you have to convert char to a string with String.value
		   * and then use concat to add the char to reverse
		   * This method is used just to demonstrate how to use and arrayList
		   */
		  ArrayList <String> chArray = new ArrayList <String>(); 
		  for ( int i = length - 1; i >= 0; i-- ){
			  	 chArray.add(String.valueOf(original.charAt(i)));
	      }
		  String reverse = ""; 
		  for (String a:chArray){
//			  System.out.println(a);
			  reverse = reverse.concat(a);
		  }
//		  System.out.println(reverse.length());
	      if (original.equals(reverse)){
	    	  System.out.println("Entered string is a palindrome. " + input);
	      	  return true;}
	      else{
	    	  	System.out.println("Entered string is not a palindrome. " + input);
	      		return false;}
	   }

	public  Boolean testStringCollectionsReverse(String input){
	      String original = input;  
	      int length = original.length();
		  /*
		   * 
		   * To use  Collections.reverse(chArray) to reverse the array
		   * note that once it is used the array is set that way unless reversed again
		   */
		  ArrayList  chArray = new ArrayList(); 
		  for ( int i = length - 1; i >= 0; i-- ){
			  	 chArray.add(original.charAt(i));
	      }
		  
		  String originalArray = chArray.toString();
		  Collections.reverse(chArray);
		  String reverseArray = chArray.toString();
		  System.out.println(reverseArray);
	      if (originalArray.equals(reverseArray)){
	    	  System.out.println("Entered string is a palindrome. " + input);
	      	  return true;}
	      else{
	    	  	System.out.println("Entered string is not a palindrome. " + input);
	      		return false;
	      		}
	  
	   }

	// for test   
	public static void main(String[] args) {
	        isStringPalidrome_String  yes = new isStringPalidrome_String();
	        System.out.println("*** Simplest reverse = reverse + original.charAt(i) ***");
	        System.out.println("This is a palidrome " + yes.testStringWithPlus("civic"));
	        System.out.println("This is a Not palidrome " + yes.testStringWithPlus("dog"));
	        System.out.println("\n***  ArrayList chArray *** ");
	        System.out.println("This is a palidrome " + yes.testStringWithArray("civic"));
	        System.out.println("This is a Not palidrome " + yes.testStringWithArray("dog"));
	        System.out.println("\n*** Collections.reverse(chArray); *** ");
	        System.out.println("This is a palidrome " + yes.testStringCollectionsReverse("civic"));
	        System.out.println("This is a Not palidrome " + yes.testStringCollectionsReverse("dog"));

	    }
	}	