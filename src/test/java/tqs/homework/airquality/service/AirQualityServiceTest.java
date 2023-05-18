package tqs.homework.airquality.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import tqs.homework.airquality.model.AirMetrics;
import tqs.homework.airquality.repository.WeatherBitRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AirQualityServiceTest {
    //chuj
//
    //asdasdsadad
//    private static final long CITY_ID = 2732265L;
//    private static final String DAY = "2020-04-05";
//
//    @Mock
//    private WeatherBitRepository repository1;
//    @InjectMocks
//    private AirQualityService service;
//    private AirMetrics loadRequest() throws JsonProcessingException {
//        String sampleJson = "{\"lat\":40.66101,\"lon\":-7.90971,\"timezone\":\"Europe/Lisbon\",\"city_name\":\"Viseu\",\"country_code\":\"PT\",\"state_code\":\"22\",\"data\":[{\"aqi\":34.0,\"o3\":74.0,\"so2\":1.16043,\"no2\":5.0,\"co\":342.548,\"pm10\":3.0,\"pm25\":2.89888}]}";
//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.readValue(sampleJson, AirMetrics.class);
//    }
//    @Test
//    public void whenGetAirMetrics_thenReturnCorrectMetrics() throws Exception {
//        AirMetrics response = loadRequest();
//
//        when(repository1.getMetrics(CITY_ID)).thenReturn(response);
//
//        assertThat(service.getCurrentAirMetrics(CITY_ID)).isInstanceOf(AirMetrics.class);
//
//        reset(repository1);
//    }
@Test
public void lol(){

}
}
