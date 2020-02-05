package one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FirstClass {

	final class MyClass implements Consumer<String> {
		private List<String> myList ;
		
		public MyClass() {
		}
		
		public MyClass(List<String> myList) {
			this.myList = myList;
		}

		@Override
		public void accept(String t) {
			System.out.println(t);
			myList.add(t.toUpperCase());
		}
	}

	public static void main(String[] args) {

		List<String> myList = new ArrayList<>(Arrays.asList("One","Two","Three","Four"));
		
		FirstClass obj = new FirstClass();
		System.out.println(myList);
		myList.forEach(obj.new MyClass(myList));

		System.out.println(myList);
	}

}
