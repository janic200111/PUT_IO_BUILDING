package pl.put.poznan.building.logic.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.building.logic.GenerateOutputJson;

@RestController
public class Controller {
	public GenerateOutputJson gOJ = new GenerateOutputJson();

	@GetMapping("/buildings/area")
	public String fullArea() {
		String ret = this.gOJ.getBuildingsArea();
		return ret;
	}

	@GetMapping("building/1/floors/area")
	public String building1Floor1Area() {
		String ret = this.gOJ.getFloorsArea(1);
		return ret;
	}

}