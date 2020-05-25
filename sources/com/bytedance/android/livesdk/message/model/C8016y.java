package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.message.model.y */
public class C8016y extends C7859c {
    @C17952c(mo34828a = "digg_count")

    /* renamed from: a */
    public int f21939a;
    @C17952c(mo34828a = "duration")

    /* renamed from: b */
    public int f21940b;
    @C17952c(mo34828a = "color")

    /* renamed from: c */
    public int f21941c;
    @C17952c(mo34828a = "user")

    /* renamed from: d */
    public User f21942d;
    @C17952c(mo34828a = "icon")

    /* renamed from: e */
    public String f21943e;

    public C8016y() {
        this.type = C8629a.DIGG;
    }

    public boolean canText() {
        if (this.f21942d != null) {
            return true;
        }
        return false;
    }

    public boolean supportDisplayText() {
        if (this.baseMessage == null || this.baseMessage.f24139j == null) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m15917a() {
        return TTLiveSDKContext.getHostService().mo10308a().context().getResources().getString(R.string.eue);
    }
}
