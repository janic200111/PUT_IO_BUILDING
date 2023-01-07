package pl.put.poznan.building.logic.rest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.put.poznan.building.logic.GenerateOutputJson;


@RestController

@RequestMapping("/building")
public class Controller {
	public GenerateOutputJson gOJ = new GenerateOutputJson();

	@GetMapping("/{buildingId}/{info}")
	public String getBuildingInfo(@PathVariable String buildingId, @PathVariable String info)
	{
		String ret = this.gOJ.getBuildingInfo(buildingId, info);
		return ret;
	}

	@GetMapping("/{buildingId}/{floorId}/{info}")
	public String getFloorInfo(@PathVariable String buildingId, @PathVariable String floorId, @PathVariable String info)
	{
		String ret = this.gOJ.getFloorInfo(buildingId, floorId, info);
		return ret;
	}

	@GetMapping("/{buildingId}/{floorId}/{roomId}/{info}")
	public String getRoomInfo(@PathVariable String buildingId, @PathVariable String floorId, @PathVariable String roomId, @PathVariable String info)
	{
		String ret = this.gOJ.getRoomInfo(buildingId, floorId, roomId, info);
		return ret;
	}
}