package shortestmile.simulator;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

/**
 * @author achinn1
 * 
 * This Class used for get co-ordinates for get the Lat and Long for zip code using the Google Maps API's.
 * TODO Develop as Services
 *
 */
public class GoogleGeoClientAPI {
	
	public static final String googleMapAPI = "https://maps.googleapis.com/maps/api/geocode/json?&address=72719";

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
   
	JSONObject res = new JSONObject(mapData);
	 if (! res.getString("status").equals("OK"))
	        return;
	 
	JSONObject obj = res.getJSONArray("results").getJSONObject(0);
	System.out.println("JSONObject :"+ obj);
	
	//Parser to reterive the Geo co-ordinates for Lat and Long 

	System.out.println("blogURL: " + obj.getString("formatted_address"));
	
	JSONObject loc = obj.getJSONObject("geometry").getJSONObject("location");
	
	System.out.println("***Lat and Longitude for Stores");
	
	System.out.println("lat  "+ loc.getDouble("lat"));
	
	System.out.println("long  "+ loc.getDouble("lng"));
	
	}
}