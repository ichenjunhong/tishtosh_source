package com.bytedance.android.livesdk.message.model;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.google.gson.p1076a.C17952c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.message.model.cl */
public class C7871cl extends C7859c {
    @C17952c(mo34828a = "action")

    /* renamed from: a */
    public long f21795a;
    @C17952c(mo34828a = "user")

    /* renamed from: b */
    public User f21796b;
    @C17952c(mo34828a = "share_target")

    /* renamed from: c */
    public String f21797c;
    @C17952c(mo34828a = "share_type")

    /* renamed from: d */
    public long f21798d;

    public C7871cl() {
        this.type = C8629a.SOCIAL;
    }

    public boolean canText() {
        if (this.f21796b != null) {
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
    public final String mo14161a() {
        Context e = C3922z.m9915e();
        String str = "";
        switch ((int) this.f21795a) {
            case 1:
                if (VERSION.SDK_INT >= 24) {
                    return C3922z.m9906a(e.getResources().getConfiguration().getLocales().get(0), (int) R.string.eug);
                }
                return e.getResources().getString(R.string.eug);
            case 3:
                if (VERSION.SDK_INT >= 24) {
                    return C3922z.m9906a(e.getResources().getConfiguration().getLocales().get(0), (int) R.string.eup);
                }
                return e.getResources().getString(R.string.eup);
            default:
                return str;
        }
    }
}
