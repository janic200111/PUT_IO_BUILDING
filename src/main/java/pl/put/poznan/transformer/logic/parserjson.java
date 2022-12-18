public Building fromJson(JsonObject json) {
  Building building = new Building();
  building.setName(json.get("name").getAsString());
  building.setLocation(json.get("location").getAsString());
  building.setHeight(json.get("height").getAsString());
  building.setNumberOfFloors(json.get("number_of_floors").getAsInt());
  building.setYearBuilt(json.get("year_built").getAsString());
  building.setMonthlyPowerUsage(json.get("monthly_power_usage").getAsString());

  JsonArray floorsArray = json.get("floors").getAsJsonArray();
  List<Floor> floors = new ArrayList<>();

  for (JsonElement floorElement : floorsArray) {
    JsonObject floorObject = floorElement.getAsJsonObject();
    Floor floor = new Floor();
    floor.setNumber(floorObject.get("number").getAsInt());

    JsonArray peopleArray = floorObject.get("people").getAsJsonArray();
    List<Person> people = new ArrayList<>();

    for (JsonElement personElement : peopleArray) {
      JsonObject personObject = personElement.getAsJsonObject();
      Person person = new Person();
      person.setName(personObject.get("name").getAsString());
      person.setPosition(personObject.get("position").getAsString());
      person.setEmail(personObject.get("email").getAsString());
      people.add(person);
    }

    floor.setPeople(people);
    floor.setMonthlyPowerUsage(floorObject.get("monthly_power_usage").getAsString());
    floor.setArea(floorObject.get("area").getAsString());
    floor.setDepartment(floorObject.get("department").getAsString());
    floor.setAdministrator(floorObject.get("administrator").getAsString());

    floors.add(floor);
  }

  building.setFloors(floors);

  return building;
}
Building building = fromJson(json);
