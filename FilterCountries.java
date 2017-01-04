package Homework1;

import java.util.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.lang.Iterable;

public class FilterCountries extends CountriesList{

	
	public static void main(String[] args) {
		
	Collection<String> countries= getAllCountries();
	Map<String,List<String>> m = new HashMap<String,List<String>>();
	
	for(String st:countries)
	{
		String firstChar = st.substring(0, 1);// get first charactor
		List<String>countryByName = null;
		
		if(!m.containsKey(firstChar))
		{
		countryByName = new ArrayList<>();
		m.put(firstChar,countryByName);
		}
		else 
		{
		countryByName = (List<String>)m.get(firstChar);
		}
		countryByName.add(st);
	}
	for(String key:m.keySet())
		{
		System.out.println("Name of Country start with Letter=============="+key+"===============");
		
		for(String country:m.get(key))
		{
			System.out.println("   "+country);
		}
		}
	
	}
	
}





	

