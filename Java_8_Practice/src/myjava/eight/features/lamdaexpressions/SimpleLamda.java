package myjava.eight.features.lamdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface MyFunctionalInterfaceOne{
	void show();
}

interface MyFunctionalInterfaceTwo{
	void show(String data);
}

interface Addable{  
    int add(int a,int b);  
} 


interface MyFunctionalInterfaceThree{
	int show() 	 ;
}


public class SimpleLamda {

	public static void main(String[] args) {
		
		int temp=10;
		MyFunctionalInterfaceOne ob1 = ()->{System.out.println("no perameter show method: "+temp);};
		ob1.show();
		
		System.out.println(temp);

		MyFunctionalInterfaceThree ob3 = () -> 5;
		
		System.out.println(ob3.show());
		
		
		//here ( are not required if there is only one perameter)
		MyFunctionalInterfaceTwo ob2 = data->{System.out.println("data: "+data);};
		ob2.show("Single perameter");
	
		
		Addable addObj=(a,b)->{
				System.out.println("sum of a and b is :"+ (a+b));
				byte d= 1;
				return d;
				};
		byte a=5,b=10;
		
	    addObj.add(5,10);
	    
	    //Collection's forEach lamda
	    int sum =0;
	    List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	    list.forEach(
	    		(n)-> ob2.show(n.toString())
	    		);
	    
	    System.out.println("sum:"+ sum);
	    
	    
	}

}
