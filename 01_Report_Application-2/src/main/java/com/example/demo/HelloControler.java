package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	
	@GetMapping("/getHello")
	public  String  getName() {
		/// o/p - final String adds = "PUNE,HYDEFRABAD,THANE,MUMBAI,CHENNAI";
		
		//List<String> forTEStrings = Arrays.asList("PUNE","HYDEFRABAD","THANE","MUMBAI","CHENNAI");
		 
        Map<String, List<String>> addsMap = new HashMap<>();
        addsMap.put("Dravid", List.of("Pune","GOA","Thane","Chennai"));
        addsMap.put("Sachin", List.of("Mumbai","Thane","Pune"));
        addsMap.put("PV Sindhu", List.of("Punjab","Delhi","Haryana"));
        addsMap.put("MS Dhoni", List.of("Goa","pune","Hyderabad"));
        
        List<String>  listStrings  = new ArrayList<>();
        Set<String> listofStringList  = new HashSet<>();
        
        for(Map.Entry<String, List<String>> resultMapEntry : addsMap.entrySet()) {
        	if(!resultMapEntry.getKey().equals("PV Sindhu")) {
        		listStrings.addAll(resultMapEntry.getValue());
        	}
        }
        
        for (String string : listStrings) {
			listofStringList.add(string.toUpperCase());
		}
       
        StringJoiner stringJoiner = new StringJoiner(",");
        for (String string : listofStringList) {
			stringJoiner.add(string);
		}
        
        System.out.println(stringJoiner);
        
        
	 return  stringJoiner.toString();
	}

}

//// engineer

