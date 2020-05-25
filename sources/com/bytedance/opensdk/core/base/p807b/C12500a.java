package com.bytedance.opensdk.core.base.p807b;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.opensdk.core.base.b.a */
public abstract class C12500a {
    @C17952c(mo34828a = "description")

    /* renamed from: c */
    public final String f32825c;
    @C17952c(mo34828a = "error_code")

    /* renamed from: d */
    public final Integer f32826d;

    /* renamed from: a */
    public final String mo23523a() {
        StringBuilder sb = new StringBuilder("error: ");
        sb.append(this.f32826d);
        return sb.toString();
    }

    public C12500a(String str, Integer num) {
        this.f32825c = str;
        this.f32826d = num;
    }
}
