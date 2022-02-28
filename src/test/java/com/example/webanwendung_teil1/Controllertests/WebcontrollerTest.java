package com.example.webanwendung_teil1.Controllertests;

import com.example.webanwendung_teil1.ApplicationService.RestService;
import com.example.webanwendung_teil1.controllers.Webcontroller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Webcontroller.class)
public class WebcontrollerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RestService service;

    @Test
    void contextLoads() {
    }

    @Test
    void pricesOnIndexPageAreShown() throws Exception {
        when(service.getBTC_EURPrice()).thenReturn("5000 EUR");
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("5000 EUR")));
    }

    @Test
    void prices() {

    }
}
