package myjava.eight.features.streamexp;

import java.util.ArrayList;
import java.util.List;

class Product{  
    int id;  
    String name;  
    float price;  
     Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}

public class StreamPrac {

	public static void main(String[] args) {

		List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // This is more compact approach for filtering data  
        
        		productsList.stream().filter(p -> p.price>25000).map(p->p.price).forEach(System.out::println);
		
        		System.out.println(productsList.stream().map(p->p.price).reduce(0.0f,Float::sum));

	}

}
