package pl.put.poznan.building.logic.rest;
import pl.put.poznan.building.logic.Building;
import pl.put.poznan.building.logic.ParseJson;

import java.io.IOException;
import java.util.List;

import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/")
	public String index(){
		String txt = ""; 

		try {
			List<Building> buildings = ParseJson.getJson();
			txt = buildings.get(0).getName();
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}

		return txt;
	}

}