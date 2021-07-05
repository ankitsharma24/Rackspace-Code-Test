package com.ankit.webservice;

import com.ankit.controller.MainController;
import com.ankit.utility.AppUtility;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@AutoConfigureMockMvc
@ContextConfiguration(classes = {MainController.class,AppUtility.class})
@WebMvcTest
public class TestReverseAPI {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testReverseAPI() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/api/Hello World")
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String resultDOW = result.getResponse().getContentAsString();
        assertNotNull(resultDOW);
        JSONObject jsonData = new JSONObject(resultDOW);
       jsonData.put("reversed","World Hello");
        assertEquals(jsonData.toString(), resultDOW);

    }
}
