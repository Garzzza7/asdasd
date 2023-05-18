package tqs.homework.airquality.controller.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import tqs.homework.airquality.AirQualityApplication;
import tqs.homework.airquality.model.AirMetrics;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = AirQualityApplication.class)
@AutoConfigureMockMvc
public class AirQualityControllerIT {
//
//    private static final long CITY_ID = 2732265L;
//    private static final String DAY = "2020-04-05";
//
//    @Autowired
//    private MockMvc servlet;
//
//    @Test
//    public void whenGetMetrics_thenReturnMetrics() throws Exception {
//        String sampleJson = "{\"lat\":40.66101,\"lon\":-7.90971,\"timezone\":\"Europe/Lisbon\",\"city_name\":\"Viseu\",\"country_code\":\"PT\",\"state_code\":\"22\",\"data\":[{\"aqi\":34.0,\"o3\":74.0,\"so2\":1.16043,\"no2\":5.0,\"co\":342.548,\"pm10\":3.0,\"pm25\":2.89888}]}";
//        AirMetrics response = loadRequest(sampleJson);
//
//        servlet.perform(get("/api/air-metrics?city_id=" + CITY_ID)
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("lat", is(response.getLat())))
//                .andExpect(jsonPath("lon", is(response.getLon())))
//                .andExpect(jsonPath("timezone", is(response.getTimezone())))
//                .andExpect(jsonPath("country_code", is(response.getCountryCode())))
//                .andExpect(jsonPath("city_name", is(response.getCityName())))
//                .andExpect(jsonPath("state_code", is(response.getStateCode())));
//    }
//
//
//
//    @Test
//    public void whenGetMetricsWithInvalidIdAndValidDay_thenIsForbidden() throws Exception {
//        servlet.perform(get("/api/air-metrics?city_id=" + 1L + "&day=" + DAY)
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isForbidden());
//
//    }
//
//
//
//    @Test
//    public void whenGetCache_thenReturnStatistics() throws Exception {
//        servlet.perform(get("/api/cache-statistics")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("numberOfRequests").isNumber())
//                .andExpect(jsonPath("numberOfHits").isNumber())
//                .andExpect(jsonPath("numberOfMisses").isNumber());
//
//    }
//
//
//
//
//
//    private AirMetrics loadRequest(String sampleJson) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.readValue(sampleJson, AirMetrics.class);
//    }
@Test
public void lol(){

}
}
