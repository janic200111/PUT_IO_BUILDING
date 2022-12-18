public class Building {
  private String name;
  private String location;
  private String height;
  private int numberOfFloors;
  private String yearBuilt;
  private String monthlyPowerUsage;
  private List<Floor> floors;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public int getNumberOfFloors() {
    return numberOfFloors;
  }

  public void setNumberOfFloors(int numberOfFloors) {
    this.numberOfFloors = numberOfFloors;
  }

  public String getYearBuilt() {
    return yearBuilt;
  }

  public void setYearBuilt(String yearBuilt) {
    this.yearBuilt = yearBuilt;
  }

  public String getMonthlyPowerUsage() {
    return monthlyPowerUsage;
  }

  public void setMonthlyPowerUsage(String monthlyPowerUsage) {
    this.monthlyPowerUsage = monthlyPowerUsage;
  }

  public List<Floor> getFloors() {
    return floors;
  }

  public void setFloors(List<Floor> floors) {
    this.floors = floors;
  }
}

public class Floor {
  private int number;
  private List<Person> people;
  private String monthlyPowerUsage;
  private String area;
  private String department;
  private String administrator;

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public List<Person> getPeople() {
    return people;
  }

  public void setPeople(List<Person> people) {
    this.people = people;
  }

  public String getMonthlyPowerUsage() {
    return monthlyPowerUsage;
  }

  public void setMonthlyPowerUsage(String monthlyPowerUsage) {
    this.monthlyPowerUsage = monthlyPowerUsage;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getAdministrator() {
    return administrator;
  }

  public void setAdministrator(String administrator) {
    this.administrator = administrator;
  }
}

public class Person {
  private String name;
  private String position;
  private String email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}

