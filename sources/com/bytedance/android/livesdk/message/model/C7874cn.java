package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.cn */
public class C7874cn extends C7859c {
    @C17952c(mo34828a = "burst_time_remain_seconds")

    /* renamed from: a */
    public long f21816a;
    @C17952c(mo34828a = "multiple")

    /* renamed from: b */
    public long f21817b;
    @C17952c(mo34828a = "property_icon")

    /* renamed from: c */
    public ImageModel f21818c;
    @C17952c(mo34828a = "property_definition_id")

    /* renamed from: d */
    public long f21819d;

    public C7874cn() {
        this.type = C8629a.TURN_TABLE_BURST;
    }
}
