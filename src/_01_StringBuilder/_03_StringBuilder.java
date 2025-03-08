package _01_StringBuilder;

import java.util.ArrayList;

public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    	String charString = "";
    	for(int i = 0; i < characters.length;i++) {
    		charString += characters[i];
    	}
    	String appended = str + charString; 
        return appended;
    }
    
    public static String reverse(String str) {
    	String reversed ="";
    	String finalString = "";
    	char[] chararray = str.toCharArray();
    	ArrayList<Character> reversedarray = new ArrayList<>();
    	for(int i =chararray.length-1; i >= 0;i--) {
    		reversedarray.add(chararray[i]);
    	}
    	for(int i = 0; i<str.length(); i++) {
    		finalString+=reversedarray.get(i);
    	}
        return finalString;
    }
    
    public static String insert(String str, int index, char newChar) {
    	char[] chararray = str.toCharArray();
    	String finalString = "";
    	ArrayList<Character> charlist = new ArrayList<>();
    	for(int i =0; i < chararray.length; i++) {
    		charlist.add(chararray[i]);
    	}
    	for(int i = 0; i < chararray.length; i++) {
    		if(i==index) {
    			charlist.add(index, newChar);
    		}
    	}
    	for(int i =0 ; i < charlist.size(); i++) {
    		finalString+=charlist.get(i);
    	}
        return finalString;
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	char[] chararray = str.toCharArray();
    	String finalString = "";
    	ArrayList<Character> charlist = new ArrayList<>();
    	for(int i = 0; i < chararray.length; i++) {
    		charlist.add(chararray[i]);
    	}
    	
    	int numofchar = endIndex-startIndex;
    	
    	for(int i = startIndex; numofchar>0;i++) {
    		charlist.remove(i);
    		i--;
    		numofchar--;
    	}
    	for(int i = 0; i < charlist.size(); i++) {
    		finalString+=charlist.get(i);
    	}
    	System.out.println(finalString);
        return finalString;
    }
}