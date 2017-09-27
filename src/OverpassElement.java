import com.google.gson.JsonObject;

public class OverpassElement {
	
	
	//	{ "type": "node",
	//     "id": 25236152,
	//     "lat": 49.0014294,
	//     "lon": 8.4082143,
	//     "tags": {
	//         "addr:city": "Karlsruhe",
	//         "addr:housenumber": "43",
	//         "addr:postcode": "76137",
	//         "addr:street": "Marienstraﬂe",
	//         "amenity": "pharmacy",
	//         "name": "Marienapotheke",
	//         "opening_hours": "Mo-Fr 08:30-13:00, 14:30-18:30; Sa 08:30-13:00",
	//         "phone": "+49 721 389325",
	//         "toilets:wheelchair": "no",
	//         "website": "http://www.marienapo.de",
	//         "wheelchair": "yes"
	//   }
	
	
	public String type;
	public long id;
	public float lat;
	public float lon;
	JsonObject tags;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public float getLat() {
		return lat;
	}
	public void setLat(float lat) {
		this.lat = lat;
	}
	public float getLon() {
		return lon;
	}
	public void setLon(float lon) {
		this.lon = lon;
	}
	public JsonObject getTags() {
		return tags;
	}
	public void setTags(JsonObject tags) {
		this.tags = tags;
	}
	
	
	
}
