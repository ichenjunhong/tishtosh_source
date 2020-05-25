package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdk.message.model.ax */
public class C7819ax extends C7859c {
    @C17952c(mo34828a = "user")

    /* renamed from: a */
    public User f21525a;
    @C17952c(mo34828a = "pre_level")

    /* renamed from: b */
    public int f21526b;
    @C17952c(mo34828a = "current_level")

    /* renamed from: c */
    public int f21527c;

    /* renamed from: d */
    public transient boolean f21528d;

    public C7819ax() {
        this.f21526b = 3;
        this.f21527c = 4;
        this.type = C8629a.HONOR_LEVEL_UP;
    }
}
