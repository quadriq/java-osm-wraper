import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.google.gson.Gson;
public class TestOSM {

	TestOSM() throws IOException{
//		String curl = "http://overpass-api.de/api/interpreter?data=[out:json][timeout:25];area(3600062518)->.searchArea;(node[\"amenity\"=\"pharmacy\"](area.searchArea);relation[\"amenity\"=\"pharmacy\"](area.searchArea););out body;>;out skel qt;";
		String curl = "http://overpass-api.de/api/interpreter?data=%5Bout%3Ajson%5D%5Btimeout%3A25%5D%3Barea%283600062518%29-%3E.searchArea%3B%28node%5B%22amenity%22%3D%22pharmacy%22%5D%28area.searchArea%29%3Brelation%5B%22amenity%22%3D%22pharmacy%22%5D%28area.searchArea%29%3B%29%3Bout%20body%3B%3E%3Bout%20skel%20qt%3B";
		URL url = new URL(curl);
        InputStreamReader reader = new InputStreamReader(url.openStream());

	    Gson gson = new Gson();
		OverpassHttpItem ohi = gson.fromJson(reader, OverpassHttpItem.class);
		
		for (OverpassElement o : ohi.getElements()){
			if(o == null){
				continue;
			}
			System.out.println(o.getLat() + "," + o.getLon() + ": " + o.getTags().toString());
		}
		

	}
	
}
