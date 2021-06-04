package br.com.talthur.botdos.solution;

import java.util.ArrayList;
import java.util.List;


public class BruteForceSolution {
	
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

    double at_least_needed = 0;
    double energy = 0;
    for (int i=arr.size()-1; i>=0; i--) {
        energy = Math.ceil((at_least_needed + arr.get(i))/2.0);
        at_least_needed = energy;
    }

    return (int) energy;
    
	}
}
