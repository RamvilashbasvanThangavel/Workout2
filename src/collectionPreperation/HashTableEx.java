package collectionPreperation;

import java.util.Hashtable;

public class HashTableEx {
	public static void main(String[] args) {
		Hashtable<Integer,String> data  = new Hashtable<>(10);
		data.put(5, "Ram");
		data.put(10, "Kavi");
		data.put(1001, "Pavi");
		data.put(30, "Deva");
		data.put(101, "Sinthya");
		data.put(106, "Arun");
		data.put(188, "Muthu");
		data.put(148, "Varun");
		data.put(1789, "Surya");
		data.put(1856, "Naren");
		data.put(1056789, "Datava");
		
		for(Integer x : data.keySet()) {
			//System.out.println(x+" "+data.get(x));
			//System.out.println(x.hashCode());
			//System.out.println(x.hashCode()%10);
			System.out.println("Key -"+x+", Value - "+data.get(x)+", Value - "+x.hashCode()+", Hashcode Index position - "+x.hashCode()%10);
		}
	}

}
