package tqs.homework.airquality.CSVREADER;

import tqs.homework.airquality.model.City;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CSVReader {
    private static final Logger logger = Logger.getLogger(CSVReader.class.getName());
    public List<City> readFIle() {
        String csvFile = "C:\\Users\\piotr\\IdeaProjects\\TQS_116634TENTOTO\\HW\\cities_all.csv";
        String line = "";
        String cvsSplitBy = ",";
        List<City> cities = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] city = line.split(cvsSplitBy);
                City cityObj = new City(Long.parseLong(city[0]), city[1]+","+city[3], city[4], city[5], city[6]);
                cities.add(cityObj);
            }
        } catch (IOException ex) {
            logger.warning(ex.toString());
        }
        return cities;
    }
}
