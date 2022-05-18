package com.frank.test.dto;

public class CheckResult {
    public enum Status {
        OK, ERROR
    }

    private final Status status;
    private final String reason;

    public CheckResult(Status status) {
        this.status = status;
        this.reason = null;
    }

    public CheckResult(Status status, String reason) {
        this.status = status;
        this.reason = reason;
    }

    public boolean isError() {
        return status == Status.ERROR;
    }

    public Status getStatus() {
        return status;
    }

    public String getReason() {
        return reason;
    }
}
