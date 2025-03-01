package _01_StringBuilder;


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
    	char[] chararray = str.toCharArray();
    	ArrayList<Char> reversedarray = new ;
    	for(int i =chararray.length; i > 0;i--) {
    		chararray[i]
    	}
        return null;
    }
    
    public static String insert(String str, int index, char newChar) {
        return null;
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
        return null;
    }
}