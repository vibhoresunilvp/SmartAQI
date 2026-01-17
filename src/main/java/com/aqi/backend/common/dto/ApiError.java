package com.aqi.backend.common.dto;

public class ApiError {
    private String code;
    private String message;
    private Object details;

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getDetails() {
        return this.details;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDetails(Object details) {
        this.details = details;
    }
}
