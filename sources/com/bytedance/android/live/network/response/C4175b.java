package com.bytedance.android.live.network.response;

import com.bytedance.android.live.base.model.Extra;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.live.network.response.b */
public class C4175b<T, R extends Extra> {
    @C17952c(mo34828a = "data")
    public T data;
    public transient RequestError error;
    @C17952c(mo34828a = "extra")
    public R extra;
    @C17952c(mo34828a = "status_code")
    public int statusCode;
}
