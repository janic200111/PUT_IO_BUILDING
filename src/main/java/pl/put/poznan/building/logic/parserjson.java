package pl.put.poznan.building.logic;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;



class ParseJson {
  public static void main(String[] args) throws JSONException, IOException
  {
    String filename = "src/main/java/pl/put/poznan/building/json buildings.json";
    JSONObject dzejson = getJsonObj(filename);

    JSONArray array = dzejson.getJSONArray("buildings");
    List<Building> buildings = new ArrayList<>();

    for (int i=0; i<array.length(); i++) buildings.add(fromJson(array.getJSONObject(i)));

    System.out.println(buildings.get(0).getName());
  }


  public static JSONObject getJsonObj(String filename) throws JSONException, IOException {
    String text = new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
    return new JSONObject(text);
  }

  public static Building fromJson(JSONObject json) {
    Building building = new Building();
    building.setName(json.getString("name"));
    building.setLocation(json.get("location").toString());
    building.setHeight(json.get("height").toString());
    building.setNumberOfFloors(json.getInt("number_of_floors"));
    building.setYearBuilt(json.getInt("year_built"));
    building.setMonthlyPowerUsage(json.getInt("monthly_power_usage"));

    JSONArray floorsArray = json.getJSONArray("floors");
    List<Floor> floors = new ArrayList<>();

    for (Object floorElement : floorsArray) {
      JSONObject floorObject = (JSONObject) floorElement;
      Floor floor = new Floor();
      floor.setNumber(floorObject.getInt("number"));

      JSONArray peopleArray = floorObject.getJSONArray("people");
      List<Person> people = new ArrayList<>();

      for (Object personElement : peopleArray) {
        JSONObject personObject = (JSONObject) personElement;
        Person person = new Person();
        person.setName(personObject.get("name").toString());
        person.setPosition(personObject.get("position").toString());
        person.setEmail(personObject.get("email").toString());
        people.add(person);
      }

      floor.setPeople(people);
      floor.setMonthlyPowerUsage(floorObject.get("monthly_power_usage").toString());
      floor.setArea(floorObject.getInt("area"));
      floor.setDepartment(floorObject.get("department").toString());
      floor.setAdministrator(floorObject.get("administrator").toString());

      floors.add(floor);
    }

    building.setFloors(floors);

    return building;
  }
}




