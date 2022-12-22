package pl.put.poznan.building.logic;

import java.io.IOException;
import java.util.List;
import org.json.JSONException;

public class GenerateOutputJson {
    public List<Building> buildings;

    public GenerateOutputJson() {
        try {
            this.buildings = ParseJson.getJson();
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
    }

    public String getBuildingsArea() {
        String ret = "{ data: [";
        for (int i = 0; i < this.buildings.size(); i++) {
            ret += "{ \"area_of_building_" + i + "\":" + this.buildings.get(i).getName() + " },";
        }
        ret += " ] }";
        return ret;
    }

    public String getFloorsArea(int building) {
        String ret = "{ data: [";
        List<Floor> floors = this.buildings.get(building).getFloors();
        for (int i = 0; i < floors.size(); i++) {
            ret += "{ \"area_of_floor_" + (i + 1) + "\":" + floors.get(i).calculateArea() + " },";
        }
        ret += " ] }";
        return ret;
    }
}