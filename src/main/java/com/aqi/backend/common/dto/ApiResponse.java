package com.aqi.backend.common.dto;

public class ApiResponse<T> {
    private boolean success;
    private T data;
    private ApiError error;
    public boolean isSuccess() { return success; }
    public void setSuccess(boolean success) { this.success = success; }
    public T getData() { return data; }
    public void setData(T data) { this.data = data; }
    public ApiError getError() { return error; }
    public void setError(ApiError error) { this.error = error; }
    // factory methods for convenience
    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> resp = new ApiResponse<>();
        resp.setSuccess(true);
        resp.setData(data);
        resp.setError(null);
        return resp;
    }
    public static <T> ApiResponse<T> failure(ApiError error) {
        ApiResponse<T> resp = new ApiResponse<>();
        resp.setSuccess(false);
        resp.setData(null);
        resp.setError(error);
        return resp;
    }
}
