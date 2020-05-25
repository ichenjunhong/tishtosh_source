package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.cf */
public class C7865cf extends C7859c {
    @C17952c(mo34828a = "content")

    /* renamed from: a */
    public String f21761a;
    @C17952c(mo34828a = "notify_type")

    /* renamed from: b */
    public long f21762b;
    @C17952c(mo34828a = "notify_class")

    /* renamed from: c */
    public int f21763c;
    @C17952c(mo34828a = "schema")

    /* renamed from: d */
    public String f21764d;
    @C17952c(mo34828a = "extra")

    /* renamed from: e */
    public RoomNotifyMessageExtra f21765e;
    @C17952c(mo34828a = "user")

    /* renamed from: f */
    public User f21766f;

    public C7865cf() {
        this.type = C8629a.ROOM_NOTIFY;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }
}
