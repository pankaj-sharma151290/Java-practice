package myjava.eight.features.streamexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExp {

	public static void main(String[] args) {
		
		List<String> houseGryffindor = Arrays.asList("Albus", "Harry", "Ron", "Hermione");
		List<String> houseHufflepuff = Arrays.asList("Bridget", "Cedric", "Nymphadora");
        List<String> houseRavenclaw = Arrays.asList("Luna", "Garrick", "Filius");
        List<String> houseSlytherin = Arrays.asList("Severus", "Tom", "Phineas");
 
        List<String> list1 = Arrays.asList("1", "2", "3");
        List<String> list2 = Arrays.asList("4", "5", "6");
        List<List<String>> lists = new ArrayList<List<String>>();
        lists.add(list1);
        lists.add(list2);
        
        List<List<String>> hogwarts = new ArrayList<List<String>>(); 
        hogwarts.add(houseGryffindor);
        hogwarts.add(houseHufflepuff);
        hogwarts.add(houseRavenclaw);
        hogwarts.add(houseSlytherin);
        

        List< List<List<String>>> listOfLists = new ArrayList<>();
        listOfLists.add(lists);
        listOfLists.add(hogwarts);

        System.out.println(hogwarts);
        
        System.out.println(hogwarts.stream().map(list -> list.stream().collect(Collectors.toList())).collect(Collectors.toList()));
    	

        System.out.println(hogwarts.stream().flatMap(list -> list.stream()).collect(Collectors.toList()));
	
        System.out.println(lists.stream().flatMap(list -> list.stream()).collect(Collectors.toList()));
        
        System.out.println(listOfLists);
        System.out.println(
        					listOfLists.stream().flatMap(list -> list.stream()).collect(Collectors.toList())
        																	   .stream().flatMap(list -> list.stream())
        																	   .collect(Collectors.toList())
        					);
	}

}
