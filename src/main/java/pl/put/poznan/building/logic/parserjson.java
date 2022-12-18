package pl.put.poznan.building.logic;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;



class MainClass {
  public static void main(String[] args)
  {

  }

  public Building fromJson(JSONObject json) {
    Building building = new Building();
    building.setName(json.get("name").toString());
    building.setLocation(json.get("location").toString());
    building.setHeight(json.get("height").toString());
    building.setNumberOfFloors(json.getInt("number_of_floors"));
    building.setYearBuilt(json.get("year_built").toString());
    building.setMonthlyPowerUsage(json.get("monthly_power_usage").toString());

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
      floor.setArea(floorObject.get("area").toString());
      floor.setDepartment(floorObject.get("department").toString());
      floor.setAdministrator(floorObject.get("administrator").toString());

      floors.add(floor);
    }

    building.setFloors(floors);

    return building;
  }
}
