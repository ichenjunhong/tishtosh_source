package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.http.p1169a.p1174d.C19190d;

/* renamed from: com.bytedance.android.livesdk.message.model.cs */
public class C7880cs extends C7859c {
    @C17952c(mo34828a = "rcmd_coupon_id")

    /* renamed from: a */
    public long f21836a;

    public C7880cs() {
        this.type = C8629a.RECOMMEND_COUPON;
    }

    public int hashCode() {
        return C19190d.m46779a(17, (Object) Long.valueOf(this.baseMessage.f24133d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7880cs) || this.baseMessage.f24133d != ((C7880cs) obj).baseMessage.f24133d) {
            return false;
        }
        return true;
    }
}
