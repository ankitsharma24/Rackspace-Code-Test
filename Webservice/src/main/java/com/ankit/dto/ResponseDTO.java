package com.ankit.dto;


import org.json.JSONObject;

import java.io.Serializable;

public class ResponseDTO implements Serializable {
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("reversed",this.response);
        return jsonObject.toString();
    }
}
