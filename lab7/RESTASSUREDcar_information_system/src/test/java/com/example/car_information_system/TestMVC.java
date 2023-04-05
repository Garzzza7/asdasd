package com.example.car_information_system;

import com.example.car_information_system.boundary.CarController;
import com.example.car_information_system.data.Car;
import com.example.car_information_system.service.CarManagerService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.mockito.Mockito.*;

@WebMvcTest(CarController.class)
public class TestMVC {
    @Autowired
    private MockMvc mvcClient;

    @MockBean
    private CarManagerService carManagerService;
    @BeforeEach
    void setUp(){
        RestAssuredMockMvc.mockMvc(mvcClient);
    }
    @Test
    public void testRESTcar() throws Exception {
        Car tesla3 = new Car("Tesla", "Model 3");
        tesla3.setCarId(1L);

        when(carManagerService.save(Mockito.any())).thenReturn(tesla3);

        RestAssuredMockMvc
                .given()
                .header("Content-Type", "application/json").body(JsonUtil.toJson(tesla3))
                .post("/api/cars")
                .then()
                    .assertThat()
                        .statusCode(201)
                .and()
                    .body("maker", equalTo("Tesla"))
                .and()
                    .body("model", equalTo("Model 3"));

        verify(carManagerService, times(1)).save(tesla3);
    }

}
