package pl.put.poznan.building.logic;
import java.io.IOException;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;


public class GenerateOutputJson {
    private List<Building> buildings;
    private String errorJson = new JSONObject().put("error", "wrong_path_value").toString();
    
    public GenerateOutputJson() {
        try {
            this.buildings = ParseJson.getJson();
        } catch (JSONException | IOException e) {
            e.printStackTrace();
        }
    }

    public String getBuildingInfo(String buildingId, String info) {
        JSONObject jsonObject = new JSONObject();
        int buildingNumber = Integer.parseInt(buildingId);

        if (buildingNumber < 0 || buildingNumber >= this.buildings.size()) return errorJson;
        switch(info) {
            case "name":
                jsonObject.put("name",  this.buildings.get(buildingNumber).getName());
                break;
            case "location":
                jsonObject.put("location",  this.buildings.get(buildingNumber).getLocation());
                break;
            case "number_of_floors":
                jsonObject.put("number_of_floors",  this.buildings.get(buildingNumber).getNumberOfFloors());
                break;
            case "year_built":
                jsonObject.put("year_built",  this.buildings.get(buildingNumber).getYearBuilt());
                break;
            case "area":
                jsonObject.put("area",  this.buildings.get(buildingNumber).calculateArea());
                break;
            case "volume":
                jsonObject.put("volume",  this.buildings.get(buildingNumber).calculateVolume());
                break;
            case "heating":
                jsonObject.put("heating",  this.buildings.get(buildingNumber).calculateHeating());
                break;
            case "light":
                jsonObject.put("light",  this.buildings.get(buildingNumber).calculateLight());
                break;
            default:
                return errorJson;
        }
        return jsonObject.toString();
    }

    public String getFloorInfo(String buildingId, String floorId, String info) {
        JSONObject jsonObject = new JSONObject();
        int buildingNumber = Integer.parseInt(buildingId);
        int floorNumber = Integer.parseInt(floorId);

        if (buildingNumber < 0 || buildingNumber >= this.buildings.size()) return errorJson;
        if (floorNumber < 0 || floorNumber >= this.buildings.get(buildingNumber).getNumberOfFloors()) return errorJson;
        
        switch(info) {
            case "area":
                jsonObject.put("area",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).calculateArea());
                break;
            case "volume":
                jsonObject.put("volume",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).calculateVolume());
                break;
            case "heating":
                jsonObject.put("heating",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).calculateHeating());
                break;
            case "light":
                jsonObject.put("light",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).calculateLight());
                break;
            case "number_of_rooms":
                jsonObject.put("number_of_rooms",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).getNumberOfRooms());
                break;
            default:
                jsonObject.put("error", "wrong_value");
        }

        return jsonObject.toString();
    }

    public String getRoomInfo(String buildingId, String floorId, String roomId, String info) {
        JSONObject jsonObject = new JSONObject();
        int buildingNumber = Integer.parseInt(buildingId);
        int floorNumber = Integer.parseInt(floorId);
        int roomNumber = Integer.parseInt(roomId);

        if (buildingNumber < 0 || buildingNumber >= this.buildings.size()) return errorJson;
        if (floorNumber < 0 || floorNumber >= this.buildings.get(buildingNumber).getNumberOfFloors()) return errorJson;
        if (roomNumber < 0 || roomNumber >= this.buildings.get(buildingNumber).getFloors().get(floorNumber).getNumberOfRooms()) return errorJson;

        switch(info) {
            case "area":
                jsonObject.put("area",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).getRooms().get(roomNumber).calculateArea());
                break;
            case "volume":
                jsonObject.put("volume",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).getRooms().get(roomNumber).calculateVolume());
                break;
            case "heating":
                jsonObject.put("heating",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).getRooms().get(roomNumber).calculateHeating());
                break;
            case "light":
                jsonObject.put("light",  this.buildings.get(buildingNumber).getFloors().get(floorNumber).getRooms().get(roomNumber).calculateLight());
                break;
            default:
                jsonObject.put("error", "wrong_value");
        }

        return jsonObject.toString();
    }
}
