package MAP;

import java.util.TreeMap;

public class TreeMapExample {

	public void Kanyakumariplaces() {

		TreeMap<String, String> placesinkk = new TreeMap<String,String>();

		//placesinkk.put(null, "Kanyakumari");   //result in null pointer exception
		placesinkk.put("Colachel", "Kanyakumari");
		placesinkk.put("Nagercoil", "Kanyakumari");
		placesinkk.put("Thukalay", "Kanyakumari");
		placesinkk.put("Monday Market", "Kanyakumari");
		placesinkk.put("Vadasery", "Kanyakumari");
		placesinkk.put("Colachel", "Kanyakumariiiii");//duplicate key means value will override...

		System.out.println(placesinkk);


	}

	public static void main( String args[]) {

		TreeMapExample treemapeg = new TreeMapExample();
		treemapeg.Kanyakumariplaces();
	}

}
