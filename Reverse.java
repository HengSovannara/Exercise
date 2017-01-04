package Homework1;

import java.util.List;

public class Reverse extends CountriesList {

	public static void main(String[] args) {
		
		int j = getAllCountries().size();
		
   	   	System.out.println("After reverse using Loop:\n");
    	for(int i=0;i<j;){
    		
       	 j-=1;
       	 
    	System.out.println(((List<String>) getAllCountries()).get(j));
    	}
	}
	

}
