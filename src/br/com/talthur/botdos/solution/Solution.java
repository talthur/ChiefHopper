package br.com.talthur.botdos.solution;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
	//3 4 3 2 4
	
	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(4);
		arr.add(3);
		arr.add(2);
		arr.add(4);
		
		System.out.println(chiefHopper(arr));
		
	}
	
	public static int chiefHopper(List<Integer> arr) {
	    int botStartEnergy = arr.get(0);
	    int optimunEnergy = 0;
	    
	    while (optimunEnergy == 0){
	        int botEnergy = botStartEnergy;
	        for (int i = 0; i < arr.size(); i++){
	            
	            if (arr.get(i) > botEnergy){
	                botEnergy -= arr.get(i) - botEnergy;
	            }
	            
	            else if (arr.get(i) < botEnergy){
	                botEnergy += botEnergy - arr.get(i);
	            }
	            
	            if(botEnergy < 0){
	                optimunEnergy = 0;
	                break;
	            }
	            optimunEnergy = botStartEnergy;
	            
	        }
	        botStartEnergy += 1;
	    }
	    
	    return optimunEnergy;

	    }

}


