package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.bs */
public class C7850bs extends C7859c {
    @C17952c(mo34828a = "action_content")

    /* renamed from: a */
    public String f21690a;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f21691b;
    @C17952c(mo34828a = "target_num")

    /* renamed from: c */
    public int f21692c;
    @C17952c(mo34828a = "show_num")

    /* renamed from: d */
    public int f21693d;
    @C17952c(mo34828a = "is_finished")

    /* renamed from: e */
    public boolean f21694e;
    @C17952c(mo34828a = "adcard_type")

    /* renamed from: f */
    public int f21695f;
    @C17952c(mo34828a = "hotvalue")

    /* renamed from: g */
    public int f21696g;

    public boolean canText() {
        return true;
    }

    public C7850bs() {
        this.f21695f = 1;
        this.type = C8629a.PROMOTION_CARD_MESSAGE;
    }
}
