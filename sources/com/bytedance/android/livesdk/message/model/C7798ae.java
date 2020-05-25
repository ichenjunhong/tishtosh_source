package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.ae */
public class C7798ae extends C7859c {
    @C17952c(mo34828a = "speedy_gift_id")

    /* renamed from: a */
    public int f21442a;
    @C17952c(mo34828a = "target_score")

    /* renamed from: b */
    public int f21443b;
    @C17952c(mo34828a = "stage_count")

    /* renamed from: c */
    public int f21444c;
    @C17952c(mo34828a = "status")

    /* renamed from: d */
    public int f21445d;
    @C17952c(mo34828a = "score")

    /* renamed from: e */
    public int f21446e;
    @C17952c(mo34828a = "contribute_most")

    /* renamed from: f */
    public User f21447f;
    @C17952c(mo34828a = "duty_id")

    /* renamed from: g */
    public long f21448g;

    public C7798ae() {
        this.type = C8629a.DUTY_GIFT_MESSAGE;
    }
}
