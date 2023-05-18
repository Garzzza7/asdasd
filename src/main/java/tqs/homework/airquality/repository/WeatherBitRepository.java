package tqs.homework.airquality.repository;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import tqs.homework.airquality.model.AirMetrics;

import java.util.logging.Level;
import java.util.logging.Logger;

@Repository
public class WeatherBitRepository {
    private static final Logger logger = Logger.getLogger(WeatherBitRepository.class.getName());
    private static final String url = "https://api.weatherbit.io/v2.0/current/airquality";
    private static final String key = "b2f9b9e9a1004bb295b94a3fb87a725e";

    private final RestTemplate restTemplate = new RestTemplateBuilder().build();

    public AirMetrics getMetrics(long cityId) {
        AirMetrics result = null;
        try {
            String url = WeatherBitRepository.url + "?city_id=" + cityId + "&key=" + key;
            result = this.restTemplate.getForObject(url, AirMetrics.class);
        }
        catch (Exception ex) {
            logger.log(Level.WARNING, ex.toString());
        }

        return result;
    }
}
