package com.alok.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.print.attribute.standard.Severity;


@JsonInclude(Include.NON_NULL)
public class ErrorDetails {
    @JsonProperty("code")
    private String errorCode;
    @JsonProperty("message")
    private String message;
    @JsonProperty("attribute")
    private String attribute;
    @JsonProperty("traceId")
    private String traceId;
    @JsonProperty("severity")
    private Severity severity;
    @JsonProperty("ticketId")
    private String ticketId;

    public ErrorDetails() {
    }

    public ErrorDetails(String attribute, String message, String traceId, String errorCode) {
        super();
        this.traceId = traceId;
        this.errorCode = errorCode;
        this.message = message;
        this.attribute = attribute;
    }

    public ErrorDetails(String attribute, String message, String errorCode) {
        super();
        this.errorCode = errorCode;
        this.message = message;
        this.attribute = attribute;
    }

    public ErrorDetails(String message, String errorCode) {
        super();
        this.errorCode = errorCode;
        this.message = message;
    }

    public ErrorDetails(String errorCode, String message, String attribute, String traceId, Severity severity, String ticketId) {
        this.errorCode = errorCode;
        this.message = message;
        this.attribute = attribute;
        this.traceId = traceId;
        this.severity = severity;
        this.ticketId = ticketId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTraceId() {
        return traceId;
    }


    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }


    public String getAttribute() {
        return attribute;
    }


    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity(Severity severity) {
        this.severity = severity;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
}
