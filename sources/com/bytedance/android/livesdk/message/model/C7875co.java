package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.co */
public class C7875co extends C7859c {
    @C17952c(mo34828a = "director_icon")

    /* renamed from: a */
    public ImageModel f21820a;
    @C17952c(mo34828a = "cur_round_index")

    /* renamed from: b */
    public int f21821b;
    @C17952c(mo34828a = "status")

    /* renamed from: c */
    public int f21822c;
    @C17952c(mo34828a = "director_schema_url")

    /* renamed from: d */
    public String f21823d;

    public C7875co() {
        this.type = C8629a.UPDATE_KOI_ROOM_STATUS_MESSAGE;
    }
}
