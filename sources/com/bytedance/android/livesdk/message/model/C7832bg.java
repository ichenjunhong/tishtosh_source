package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.message.model.bg */
public class C7832bg extends C7859c {
    @C17952c(mo34828a = "promotion_id")

    /* renamed from: a */
    long f21599a;
    @C17952c(mo34828a = "msg_type")

    /* renamed from: b */
    int f21600b;
    @C17952c(mo34828a = "target_uid")

    /* renamed from: c */
    List<Long> f21601c;
    @C17952c(mo34828a = "sec_target_uid")

    /* renamed from: d */
    List<String> f21602d;
    @C17952c(mo34828a = "bubble_type")

    /* renamed from: e */
    int f21603e;
    @C17952c(mo34828a = "screenshot_timestamp")

    /* renamed from: f */
    long f21604f;
    @C17952c(mo34828a = "ecom_notice")

    /* renamed from: g */
    String f21605g;

    public C7832bg() {
        this.type = C8629a.LIVE_SHOPPING;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("msgType:");
        sb.append(this.f21600b);
        return sb.toString();
    }
}
