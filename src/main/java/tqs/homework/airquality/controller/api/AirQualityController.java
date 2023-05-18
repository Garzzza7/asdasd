package tqs.homework.airquality.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tqs.homework.airquality.cache.Cache;
import tqs.homework.airquality.model.AirMetrics;
import tqs.homework.airquality.service.AirQualityService;

@RestController
@RequestMapping("/api")
public class AirQualityController {

    @Autowired
    private AirQualityService airQualityService;

    @GetMapping("/air-metrics")
    public AirMetrics getAirMetrics(@RequestParam(value = "city_id") Long cityId) {
            return airQualityService.getCurrentAirMetrics(cityId);
        }


    @GetMapping("cache-statistics")
    public Cache getCacheStatistics() {
        return airQualityService.getCacheStatistics();
    }
}
