package com.example.ms1;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

// Step 1: load ONLY the web layer for MS1Controller
@WebMvcTest(MS1Controller.class)
public class MS1ControllerTest {

    @Autowired
    private MockMvc mockMvc;

    // Step 2 & 3: GET /ms1/add?a=5&b=10 -> 200 OK, body "MS 1.1 - Additon = 15"
    @Test
    void testAddEndpoint() throws Exception {
        mockMvc.perform(get("/ms1/add")
                    .param("a", "5")
                    .param("b", "10"))
               .andExpect(status().isOk())
               .andExpect(content().string("MS 1.1 - Additon = 15"));
    }
}
