package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.http.p1169a.p1174d.C19190d;

/* renamed from: com.bytedance.android.livesdk.message.model.ct */
public class C7881ct extends C7859c {
    @C17952c(mo34828a = "rcmd_goods_id")

    /* renamed from: a */
    public long f21837a;

    public C7881ct() {
        this.type = C8629a.RECOMMEND_GOODS;
    }

    public int hashCode() {
        return C19190d.m46779a(17, (Object) Long.valueOf(this.baseMessage.f24133d));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7881ct) || this.baseMessage.f24133d != ((C7881ct) obj).baseMessage.f24133d) {
            return false;
        }
        return true;
    }
}
