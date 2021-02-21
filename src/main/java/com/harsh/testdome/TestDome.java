package com.harsh.testdome;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;

public class TestDome {
	 public static String[] uniqueNames(String[] names1, String[] names2) {
	       Set<String> resultSet = new HashSet<>(names1.length + names2.length);
	        
	       int n = names1.length >= names2.length ? names1.length : names2.length;
	       for (int i = 0; i < n; i++){
	           
	           if(i < names1.length){
	               resultSet.add(names1[i]);
	           }
	           
	           if(i < names2.length){
	               resultSet.add(names2[i]);
	           }
	       }
	        
	       String[] result = new String[resultSet.size()];
	       
	       Iterator<String> it = resultSet.iterator();
	       int i=0;
	       while(it.hasNext()){
	    	   result[i++] = (it.next());
	       }
	        return result; 
	    }
	    
	    public static void main(String[] args) {
	        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
	        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
	        System.out.println(String.join(", ", TestDome.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
	    }
}
