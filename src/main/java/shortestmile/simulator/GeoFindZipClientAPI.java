package shortestmile.simulator;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

/**
 * @author achinn1
 * 
 * This Class used for input the co-ordinates for get the Lat and Long for zip code using the Geo API's to find near by zipcodes.
 * TODO Develop as Services
 *
 */
public class GeoFindZipClientAPI {
	
	public static final String googleMapAPI = "http://api.geonames.org/findNearbyPostalCodesJSON?lat=36.389963&lng=-94.25&username=anandchinnakannan";

	public static void main(String arg[]) throws IOException {
	
	String mapData = "";
	
	// Google search API from getting the co-ordinates informations
	URL url = new URL(googleMapAPI);	 
	
	// read from the URL using the Scnanner Tables
	
	Scanner scan = new Scanner(url.openStream());
		while (scan.hasNext()){
			mapData += scan.nextLine();
		}
	scan.close();
	
	// build a JSON object
    System.out.println("mapData"+mapData);
	JSONObject res = new JSONObject(mapData);
	System.out.println("JSONObject res:"+ res);
	
	JSONObject obj = res.getJSONArray("postalCodes").getJSONObject(0);
	System.out.println("JSONObject===> :"+ obj);
	
	//Parser to reterive the Geo co-ordinates for Lat and Long 

	System.out.println("***Near by Zip Codes for Stores***");
	
	System.out.println("Postalcode1: " + obj.getString("postalCode"));
	
	JSONObject obj1 = res.getJSONArray("postalCodes").getJSONObject(1);
	
	System.out.println("Postalcode2: " + obj1.getString("postalCode"));
	
    JSONObject obj2 = res.getJSONArray("postalCodes").getJSONObject(2);
	
	System.out.println("Postalcode3: " + obj2.getString("postalCode"));
	
	JSONObject obj3 = res.getJSONArray("postalCodes").getJSONObject(3);
	
	System.out.println("Postalcode4: " + obj3.getString("postalCode"));
	
	JSONObject obj4 = res.getJSONArray("postalCodes").getJSONObject(4);
	
	System.out.println("Postalcode5: " + obj4.getString("postalCode"));
	
	
	}
}
