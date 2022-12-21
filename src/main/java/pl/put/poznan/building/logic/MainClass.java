package pl.put.poznan.building.logic;
import pl.put.poznan.building.logic.rest.*;

import java.io.IOException;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;

public class MainClass {

    public String data;

    public static void main(String[] args) throws JSONException, IOException
    {
        SpringApplication.run(Application.class, args);
    }
}
