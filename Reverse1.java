package Homework1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Reverse1 extends CountriesList{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> st=getAllCountries();
		//ArrayList<String> str=new ArrayList<String>();
		//str.addAll(st);
		Collections.reverse((List<String>) st);
		//System.out.println("Here is the Normal collection:" + "\n" +st+"\n");
		System.out.println("Here is the Reverse collection:" + "\n" +st);
				
	}

}
