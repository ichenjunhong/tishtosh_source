package com.bytedance.android.live.network.response;

import com.google.gson.p1076a.C17952c;

public class RequestError {
    @C17952c(mo34828a = "alert")
    public String alert;
    @C17952c(mo34828a = "message")
    public String message;
    @C17952c(mo34828a = "prompts")
    public String prompts = "Operation failed, please try again later";
    public transient String url;
}
