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

public class ParseJson {
  public static List<Building> getJson() throws JSONException, IOException {
    String filename = "src/main/java/pl/put/poznan/building/json buildings.json";
    JSONObject dzejson = getJsonObj(filename);
    JSONArray array = dzejson.getJSONArray("buildings");
    List<Building> buildings = new ArrayList<>();
    for (int i = 0; i < array.length(); i++)
      buildings.add(ParseJson.fromJson(array.getJSONObject(i)));
    return buildings;
  }

  public static JSONObject getJsonObj(String filename) throws JSONException, IOException {
    String text = new String(Files.readAllBytes(Paths.get(filename)), StandardCharsets.UTF_8);
    return new JSONObject(text);
  }

  public static Building fromJson(JSONObject json) {
    Building building = new Building();
    building.setName(json.getString("name"));
    building.setLocation(json.get("location").toString());
    building.setNumberOfFloors(json.getInt("number_of_floors"));
    building.setYearBuilt(json.getInt("year_built"));
    JSONArray floorsArray = json.getJSONArray("floors");
    List<Floor> floors = new ArrayList<>();
    for (Object floorElement : floorsArray) {
      JSONObject floorObject = (JSONObject) floorElement;
      Floor floor = new Floor();
      floor.setNumber(floorObject.getInt("number"));

      JSONArray peopleArray = floorObject.getJSONArray("rooms");
      List<Room> rooms = new ArrayList<>();

      for (Object personElement : peopleArray) {
        JSONObject personObject = (JSONObject) personElement;
        Room room = new Room();
        room.setNumber(personObject.get("number").toString());
        room.setArea(personObject.get("area").toString());
        room.setCube(personObject.get("cube").toString());
        room.setHeating(personObject.get("heating").toString());
        room.setLight(personObject.get("light").toString());
        rooms.add(room);
      }

      floor.addRooms(rooms);
      floors.add(floor);
    }

    building.setFloors(floors);
    return building;
  }
}