package com.jisty.portal.student;

public class StudentResponse {
    private String responseCode;
    private String responseMessage;
    private String responseDetail;

    public StudentResponse() {

    }

    public StudentResponse(String responseCode, String responseMessage, String responseDetail) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
        this.responseDetail = responseDetail;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getReponseDetail() {
        return responseDetail;
    }

    public void setResponseDetail(String responseDetail) {
        this.responseDetail = responseDetail;
    }
}