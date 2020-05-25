package com.bytedance.android.livesdk.verify.model;

import com.google.gson.p1076a.C17952c;

public class QueryZhimaStatusResponse {
    public static final int NOT_PASSED = 0;
    public static final int PASSED = 1;
    @C17952c(mo34828a = "failed_reason")
    private String failedReason;
    @C17952c(mo34828a = "msg")
    private String message;
    @C17952c(mo34828a = "is_verified")
    private boolean passed;
    @C17952c(mo34828a = "status_code")
    private int statusCode;

    public String getFailedReason() {
        return this.failedReason;
    }

    public String getMessage() {
        return this.message;
    }

    public boolean getPassed() {
        return this.passed;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
